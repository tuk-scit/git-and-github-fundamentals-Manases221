package com.manasesapplication.app.modules.spareshop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivitySpareShopBinding
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.payment.ui.PaymentActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import com.manasesapplication.app.modules.spareshop.`data`.viewmodel.SpareShopVM
import kotlin.String
import kotlin.Unit

class SpareShopActivity : BaseActivity<ActivitySpareShopBinding>(R.layout.activity_spare_shop) {
  private val viewModel: SpareShopVM by viewModels<SpareShopVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.spareShopVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPayNow.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorSix.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPARE_SHOP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpareShopActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
