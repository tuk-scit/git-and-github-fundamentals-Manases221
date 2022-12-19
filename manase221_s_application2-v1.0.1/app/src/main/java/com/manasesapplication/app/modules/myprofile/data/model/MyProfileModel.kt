package com.manasesapplication.app.modules.myprofile.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadyourima: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_your_ima)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_name_manase_kip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCARNUMBERKDG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_car_number_kdg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCARMODELFORES: String? =
      MyApp.getInstance().resources.getString(R.string.msg_car_model_fores)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLASTAPPOINTMEN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_appointmen)

)
