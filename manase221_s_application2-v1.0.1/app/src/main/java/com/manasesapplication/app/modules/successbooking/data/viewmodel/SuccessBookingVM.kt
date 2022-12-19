package com.manasesapplication.app.modules.successbooking.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.successbooking.`data`.model.SuccessBookingModel
import org.koin.core.KoinComponent

class SuccessBookingVM : ViewModel(), KoinComponent {
  val successBookingModel: MutableLiveData<SuccessBookingModel> =
      MutableLiveData(SuccessBookingModel())

  var navArguments: Bundle? = null
}
