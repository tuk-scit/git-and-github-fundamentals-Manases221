package com.manasesapplication.app.modules.adminhomepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityAdminHomepageBinding
import com.manasesapplication.app.modules.adminhomepage.`data`.viewmodel.AdminHomepageVM
import com.manasesapplication.app.modules.adminprofile.ui.AdminProfileActivity
import kotlin.String
import kotlin.Unit

class AdminHomepageActivity :
    BaseActivity<ActivityAdminHomepageBinding>(R.layout.activity_admin_homepage) {
  private val viewModel: AdminHomepageVM by viewModels<AdminHomepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminHomepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_HOMEPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminHomepageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
