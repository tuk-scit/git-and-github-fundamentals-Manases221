package com.manasesapplication.app.modules.booking.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBOOKDATE: String? = MyApp.getInstance().resources.getString(R.string.lbl_book_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSELECT: String? = MyApp.getInstance().resources.getString(R.string.lbl_select)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekday: String? = MyApp.getInstance().resources.getString(R.string.lbl_monday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tuesday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_wednesday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_thursday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_friday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekdayFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_saturday)

)
