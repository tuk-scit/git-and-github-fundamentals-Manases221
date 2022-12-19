package com.manasesapplication.app.modules.carproblems.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityCarProblemsBinding
import com.manasesapplication.app.modules.booking.ui.BookingActivity
import com.manasesapplication.app.modules.carproblems.`data`.model.CarProblemsRowModel
import com.manasesapplication.app.modules.carproblems.`data`.viewmodel.CarProblemsVM
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CarProblemsActivity : BaseActivity<ActivityCarProblemsBinding>(R.layout.activity_car_problems)
    {
  private val viewModel: CarProblemsVM by viewModels<CarProblemsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val carProblemsAdapter =
    CarProblemsAdapter(viewModel.carProblemsList.value?:mutableListOf())
    binding.recyclerCarProblems.adapter = carProblemsAdapter
    carProblemsAdapter.setOnItemClickListener(
    object : CarProblemsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CarProblemsRowModel) {
        onClickRecyclerCarProblems(view, position, item)
      }
    }
    )
    viewModel.carProblemsList.observe(this) {
      carProblemsAdapter.updateData(it)
    }
    binding.carProblemsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVectorThree.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnRepaire.setOnClickListener {
      val destIntent = BookingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCarProblems(
    view: View,
    position: Int,
    item: CarProblemsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CAR_PROBLEMS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarProblemsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
