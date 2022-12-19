package com.manasesapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityLoginBinding
import com.manasesapplication.app.modules.adminhomepage.ui.AdminHomepageActivity
import com.manasesapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import com.manasesapplication.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtNotyetamembe.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLoginOne.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogin.setOnClickListener {
      val destIntent = AdminHomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
