package com.manasesapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityAppNavigationBinding
import com.manasesapplication.app.modules.adminhomepage.ui.AdminHomepageActivity
import com.manasesapplication.app.modules.adminprofile.ui.AdminProfileActivity
import com.manasesapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.manasesapplication.app.modules.booking.ui.BookingActivity
import com.manasesapplication.app.modules.bookingappointment.ui.BookingAppointmentActivity
import com.manasesapplication.app.modules.carproblems.ui.CarProblemsActivity
import com.manasesapplication.app.modules.discount.ui.DiscountActivity
import com.manasesapplication.app.modules.discrequest.ui.DiscRequestActivity
import com.manasesapplication.app.modules.home.ui.HomeActivity
import com.manasesapplication.app.modules.login.ui.LoginActivity
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.payment.ui.PaymentActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import com.manasesapplication.app.modules.signup.ui.SignUpActivity
import com.manasesapplication.app.modules.spareshop.ui.SpareShopActivity
import com.manasesapplication.app.modules.success.ui.SuccessActivity
import com.manasesapplication.app.modules.successbooking.ui.SuccessBookingActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearBookingAppointment.setOnClickListener {
      val destIntent = BookingAppointmentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSevices.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyProfile.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSuccess.setOnClickListener {
      val destIntent = SuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAdminProfile.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBooking.setOnClickListener {
      val destIntent = BookingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDiscount.setOnClickListener {
      val destIntent = DiscountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSpareShop.setOnClickListener {
      val destIntent = SpareShopActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAdminHomepage.setOnClickListener {
      val destIntent = AdminHomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPayment.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCarProblems.setOnClickListener {
      val destIntent = CarProblemsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSuccessBooking.setOnClickListener {
      val destIntent = SuccessBookingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDiscRequest.setOnClickListener {
      val destIntent = DiscRequestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
