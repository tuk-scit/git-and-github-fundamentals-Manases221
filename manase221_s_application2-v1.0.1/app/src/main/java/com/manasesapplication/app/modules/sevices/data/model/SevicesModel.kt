package com.manasesapplication.app.modules.sevices.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SevicesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSERVICESOFFERE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_services_offere)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocatetheshop: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_locate_the_shop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnquirecarpro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enquire_car_pro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSparepartssho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_spare_parts_sho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleappoin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_schedule_appoin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarproblems: String? = MyApp.getInstance().resources.getString(R.string.lbl_car_problems)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAskfordiscoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ask_for_discoun)

)
