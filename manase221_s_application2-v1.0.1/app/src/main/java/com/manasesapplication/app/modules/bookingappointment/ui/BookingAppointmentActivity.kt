package com.manasesapplication.app.modules.bookingappointment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.base.BaseActivity
import com.manasesapplication.app.databinding.ActivityBookingAppointmentBinding
import com.manasesapplication.app.modules.booking.ui.BookingActivity
import com.manasesapplication.app.modules.bookingappointment.`data`.viewmodel.BookingAppointmentVM
import com.manasesapplication.app.modules.myprofile.ui.MyProfileActivity
import com.manasesapplication.app.modules.sevices.ui.SevicesActivity
import kotlin.String
import kotlin.Unit

class BookingAppointmentActivity :
    BaseActivity<ActivityBookingAppointmentBinding>(R.layout.activity_booking_appointment) {
  private val viewModel: BookingAppointmentVM by viewModels<BookingAppointmentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingAppointmentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVectorThree.setOnClickListener {
      val destIntent = SevicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBook.setOnClickListener {
      val destIntent = BookingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKING_APPOINTMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookingAppointmentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
