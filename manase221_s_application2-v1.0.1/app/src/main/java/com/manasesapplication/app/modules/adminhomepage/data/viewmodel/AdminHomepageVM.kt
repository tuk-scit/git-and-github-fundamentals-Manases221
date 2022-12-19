package com.manasesapplication.app.modules.adminhomepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.adminhomepage.`data`.model.AdminHomepageModel
import org.koin.core.KoinComponent

class AdminHomepageVM : ViewModel(), KoinComponent {
  val adminHomepageModel: MutableLiveData<AdminHomepageModel> =
      MutableLiveData(AdminHomepageModel())

  var navArguments: Bundle? = null
}
