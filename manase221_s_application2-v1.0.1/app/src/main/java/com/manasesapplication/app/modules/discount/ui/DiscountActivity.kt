package com.manasesapplication.app.modules.discount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityDiscountBinding
import com.manasesapplication.app.modules.discount.`data`.viewmodel.DiscountVM
import com.manasesapplication.app.modules.discrequest.ui.DiscRequestActivity
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.payment.ui.PaymentActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import kotlin.String
import kotlin.Unit

class DiscountActivity : BaseActivity<ActivityDiscountBinding>(R.layout.activity_discount) {
  private val viewModel: DiscountVM by viewModels<DiscountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.discountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVectorThree.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnRequest.setOnClickListener {
      val destIntent = DiscRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPayNow.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DISCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DiscountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
