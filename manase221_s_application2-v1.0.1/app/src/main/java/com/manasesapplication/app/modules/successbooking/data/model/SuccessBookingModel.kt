package com.manasesapplication.app.modules.successbooking.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessBookingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_date_successful)

)
