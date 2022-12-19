package com.manasesapplication.app.modules.home.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWELCOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAffordablepric: String? =
      MyApp.getInstance().resources.getString(R.string.msg_affordable_pri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_offering_a_rang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2022novEighteen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2022_nov_18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSparepartsnow: String? =
      MyApp.getInstance().resources.getString(R.string.msg_spare_parts_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemidersforca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remiders_for_ca)

)
