package com.manasesapplication.app.modules.appnavigation.`data`.model

import com.manasesapplication.app.R
import com.manasesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSevices: String? = MyApp.getInstance().resources.getString(R.string.lbl_sevices)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookingAppointment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_booking_appoint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscount: String? = MyApp.getInstance().resources.getString(R.string.lbl_discount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpareShop: String? = MyApp.getInstance().resources.getString(R.string.lbl_spare_shop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscRequest: String? = MyApp.getInstance().resources.getString(R.string.lbl_disc_request)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarProblems: String? = MyApp.getInstance().resources.getString(R.string.lbl_car_problems3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBooking: String? = MyApp.getInstance().resources.getString(R.string.lbl_booking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccessBooking: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_success_booking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminHomepage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_admin_homepage)

)
