package com.manasesapplication.app.modules.spareshop.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SpareShopModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_spares)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrices: String? = MyApp.getInstance().resources.getString(R.string.lbl_prices)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddcart: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_engine_oil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_800)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirfilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_air_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSparkplugs: String? = MyApp.getInstance().resources.getString(R.string.lbl_spark_plugs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_900)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_battery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_8600)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtACfilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_ac_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_1000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrakePads: String? = MyApp.getInstance().resources.getString(R.string.lbl_brake_pads)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOilFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_oil_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_1200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOTAL: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_7700)

)
