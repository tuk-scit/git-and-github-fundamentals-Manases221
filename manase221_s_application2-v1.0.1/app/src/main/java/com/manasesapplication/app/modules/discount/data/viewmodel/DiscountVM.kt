package com.manasesapplication.app.modules.discount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.discount.`data`.model.DiscountModel
import org.koin.core.KoinComponent

class DiscountVM : ViewModel(), KoinComponent {
  val discountModel: MutableLiveData<DiscountModel> = MutableLiveData(DiscountModel())

  var navArguments: Bundle? = null
}
