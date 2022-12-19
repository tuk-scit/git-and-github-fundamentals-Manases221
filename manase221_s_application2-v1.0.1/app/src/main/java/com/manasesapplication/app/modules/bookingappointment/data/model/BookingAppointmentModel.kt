package com.manasesapplication.app.modules.bookingappointment.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookingAppointmentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBOOKAPPOINTMEN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_book_appointmen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.msg_state_the_car_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsernameOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_date_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
