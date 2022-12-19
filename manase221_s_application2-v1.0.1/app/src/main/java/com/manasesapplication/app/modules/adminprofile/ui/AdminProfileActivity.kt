package com.manasesapplication.app.modules.adminprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityAdminProfileBinding
import com.manasesapplication.app.modules.adminprofile.`data`.viewmodel.AdminProfileVM
import kotlin.String
import kotlin.Unit

class AdminProfileActivity :
    BaseActivity<ActivityAdminProfileBinding>(R.layout.activity_admin_profile) {
  private val viewModel: AdminProfileVM by viewModels<AdminProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADMIN_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
