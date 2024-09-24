package com.alpermelkeli.navigationdrawer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alpermelkeli.navigationdrawer.screens.Home
import com.alpermelkeli.navigationdrawer.screens.Settings
import com.alpermelkeli.navigationdrawer.screens.Urgent

@Composable
fun AppNavHost(startDestination:String, navController:NavHostController){


    NavHost(navController = navController, startDestination = startDestination ) {

        composable(route = NavRoutes.Home.route){
            Home()
        }
        composable(route = NavRoutes.Urgent.route){
            Urgent()
        }
        composable(route = NavRoutes.Settings.route){
            Settings()
        }


    }



}