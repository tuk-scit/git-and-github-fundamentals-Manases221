package com.manasesapplication.app.modules.adminprofile.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AdminProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMYPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMathewKimani: String? = MyApp.getInstance().resources.getString(R.string.lbl_mathew_kimani)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNUMBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt34567829: String? = MyApp.getInstance().resources.getString(R.string.lbl_34567829)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMechanic: String? = MyApp.getInstance().resources.getString(R.string.lbl_mechanic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_station)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_rank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdministrator: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_administrator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_job_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2345)

)
