package com.manasesapplication.app.modules.booking.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityBookingBinding
import com.manasesapplication.app.modules.booking.`data`.viewmodel.BookingVM
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import com.manasesapplication.app.modules.successbooking.ui.SuccessBookingActivity
import kotlin.String
import kotlin.Unit

class BookingActivity : BaseActivity<ActivityBookingBinding>(R.layout.activity_booking) {
  private val viewModel: BookingVM by viewModels<BookingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnTakeIt.setOnClickListener {
      val destIntent = SuccessBookingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorThree.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
