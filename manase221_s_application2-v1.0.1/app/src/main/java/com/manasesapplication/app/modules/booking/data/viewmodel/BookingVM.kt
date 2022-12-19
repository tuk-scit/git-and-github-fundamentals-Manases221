package com.manasesapplication.app.modules.booking.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.booking.`data`.model.BookingModel
import org.koin.core.KoinComponent

class BookingVM : ViewModel(), KoinComponent {
  val bookingModel: MutableLiveData<BookingModel> = MutableLiveData(BookingModel())

  var navArguments: Bundle? = null
}
