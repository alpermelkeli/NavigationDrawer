package com.alpermelkeli.navigationdrawer.navigation

sealed class NavRoutes(val route:String) {

    object Home:NavRoutes("home")
    object Settings:NavRoutes("settings")
    object Urgent:NavRoutes("urgent")

}