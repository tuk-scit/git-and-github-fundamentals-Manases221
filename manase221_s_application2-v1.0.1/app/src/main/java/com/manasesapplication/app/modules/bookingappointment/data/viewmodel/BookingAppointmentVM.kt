package com.manasesapplication.app.modules.bookingappointment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.bookingappointment.`data`.model.BookingAppointmentModel
import org.koin.core.KoinComponent

class BookingAppointmentVM : ViewModel(), KoinComponent {
  val bookingAppointmentModel: MutableLiveData<BookingAppointmentModel> =
      MutableLiveData(BookingAppointmentModel())

  var navArguments: Bundle? = null
}
