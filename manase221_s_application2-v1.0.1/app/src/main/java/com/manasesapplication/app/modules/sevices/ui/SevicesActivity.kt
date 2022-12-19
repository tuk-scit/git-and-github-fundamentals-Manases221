package com.manasesapplication.app.modules.sevices.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivitySevicesBinding
import com.manasesapplication.app.modules.bookingappointment.ui.BookingAppointmentActivity
import com.manasesapplication.app.modules.carproblems.ui.CarProblemsActivity
import com.manasesapplication.app.modules.discrequest.ui.DiscRequestActivity
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.sevices.`data`.viewmodel.SevicesVM
import com.manasesapplication.app.modules.spareshop.ui.SpareShopActivity
import kotlin.String
import kotlin.Unit

class SevicesActivity : BaseActivity<ActivitySevicesBinding>(R.layout.activity_sevices) {
  private val viewModel: SevicesVM by viewModels<SevicesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sevicesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDiscount.setOnClickListener {
      val destIntent = DiscRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCarproblems.setOnClickListener {
      val destIntent = CarProblemsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearScheduleappoin.setOnClickListener {
      val destIntent = BookingAppointmentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSpareparts.setOnClickListener {
      val destIntent = SpareShopActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEVICES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SevicesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
