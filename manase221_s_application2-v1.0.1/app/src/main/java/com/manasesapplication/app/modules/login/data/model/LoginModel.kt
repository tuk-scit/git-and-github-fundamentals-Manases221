package com.manasesapplication.app.modules.login.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMYFASTSERV: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_fastserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_login_as_an_adm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGINASACUST: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_as_a_cust)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_email_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotyetamembe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_yet_a_membe)

)
