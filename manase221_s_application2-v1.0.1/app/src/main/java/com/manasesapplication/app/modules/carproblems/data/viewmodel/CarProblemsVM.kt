package com.manasesapplication.app.modules.carproblems.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.manasesapplication.app.modules.carproblems.`data`.model.CarProblemsModel
import com.manasesapplication.app.modules.carproblems.`data`.model.CarProblemsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CarProblemsVM : ViewModel(), KoinComponent {
  val carProblemsModel: MutableLiveData<CarProblemsModel> = MutableLiveData(CarProblemsModel())

  var navArguments: Bundle? = null

  val carProblemsList: MutableLiveData<MutableList<CarProblemsRowModel>> =
      MutableLiveData(mutableListOf())
}
