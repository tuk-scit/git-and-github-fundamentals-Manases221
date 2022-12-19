package com.manasesapplication.app.modules.discrequest.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.discrequest.`data`.model.DiscRequestModel
import org.koin.core.KoinComponent

class DiscRequestVM : ViewModel(), KoinComponent {
  val discRequestModel: MutableLiveData<DiscRequestModel> = MutableLiveData(DiscRequestModel())

  var navArguments: Bundle? = null
}
