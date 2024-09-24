package com.alpermelkeli.navigationdrawer.navdrawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import com.alpermelkeli.navigationdrawer.navigation.NavRoutes

val items = listOf(
    NavDrawerItem(
        title = "Home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        route = NavRoutes.Home.route
    ),
    NavDrawerItem(
        title = "Urgent",
        selectedIcon = Icons.Filled.Info,
        unselectedIcon = Icons.Outlined.Info,
        badgeCount = 45,
        route = NavRoutes.Urgent.route
    ),
    NavDrawerItem(
        title = "Settings",
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
        route = NavRoutes.Settings.route
    ),
)