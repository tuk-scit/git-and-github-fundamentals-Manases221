package com.manasesapplication.app.modules.spareshop.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.spareshop.`data`.model.SpareShopModel
import org.koin.core.KoinComponent

class SpareShopVM : ViewModel(), KoinComponent {
  val spareShopModel: MutableLiveData<SpareShopModel> = MutableLiveData(SpareShopModel())

  var navArguments: Bundle? = null
}
