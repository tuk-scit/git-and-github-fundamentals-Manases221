package com.manasesapplication.app.modules.sevices.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.sevices.`data`.model.SevicesModel
import org.koin.core.KoinComponent

class SevicesVM : ViewModel(), KoinComponent {
  val sevicesModel: MutableLiveData<SevicesModel> = MutableLiveData(SevicesModel())

  var navArguments: Bundle? = null
}
