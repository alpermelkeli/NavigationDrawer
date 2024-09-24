package com.alpermelkeli.navigationdrawer.navdrawer

import androidx.compose.ui.graphics.vector.ImageVector

data class NavDrawerItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route:String,
    val badgeCount: Int? = null
)