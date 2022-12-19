package com.manasesapplication.app.modules.discrequest.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityDiscRequestBinding
import com.manasesapplication.app.modules.discrequest.`data`.viewmodel.DiscRequestVM
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.payment.ui.PaymentActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import kotlin.String
import kotlin.Unit

class DiscRequestActivity : BaseActivity<ActivityDiscRequestBinding>(R.layout.activity_disc_request)
    {
  private val viewModel: DiscRequestVM by viewModels<DiscRequestVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.discRequestVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPayNow.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorThree.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DISC_REQUEST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DiscRequestActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
