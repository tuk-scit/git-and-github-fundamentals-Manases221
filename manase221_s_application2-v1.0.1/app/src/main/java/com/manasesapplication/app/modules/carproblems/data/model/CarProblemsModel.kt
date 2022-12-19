package com.manasesapplication.app.modules.carproblems.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CarProblemsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCARPROBLEMS: String? = MyApp.getInstance().resources.getString(R.string.lbl_car_problems2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSELECT: String? = MyApp.getInstance().resources.getString(R.string.lbl_select)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExhaustsmoke: String? = MyApp.getInstance().resources.getString(R.string.lbl_exhaust_smoke)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEngineoverheatiOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_engineoverheati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLowfuelmileag: String? =
      MyApp.getInstance().resources.getString(R.string.msg_low_fuel_mileag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeadbattery: String? = MyApp.getInstance().resources.getString(R.string.lbl_dead_battery)

)
