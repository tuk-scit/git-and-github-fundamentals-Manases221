package com.manasesapplication.app.modules.adminhomepage.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AdminHomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtACTIVITIES: String? = MyApp.getInstance().resources.getString(R.string.lbl_activities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDNEWCUSTOME: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_new_custome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_view_appointme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtREQUESTFORNEW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_request_for_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_check_inventor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_payments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_pay_mechanics)

)
