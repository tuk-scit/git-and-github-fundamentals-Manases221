package com.manasesapplication.app.modules.discount.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DiscountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_request_discpou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_the_quetation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRepairs: String? = MyApp.getInstance().resources.getString(R.string.lbl_repairs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt45000: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMachanic: String? = MyApp.getInstance().resources.getString(R.string.lbl_machanic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_6000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPartsreplaceme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_parts_replaceme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt20000: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOTAL71000: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_71_000)

)
