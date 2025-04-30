package com.pdmtaller2.miguelramirez_00095322.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController

data class BottomNavItem(val screen: Screen, val icon: ImageVector)

@Composable
fun BottomNavigationBar(
    currentRoute: String?,
    navController: NavController
) {
    val items = listOf(
        BottomNavItem(Screen.Main, Icons.Filled.List),
        BottomNavItem(Screen.Search, Icons.Filled.Search),
        BottomNavItem(Screen.Orders, Icons.Filled.ShoppingCart)
    )

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.screen.title) },
                label = { Text(item.screen.title) },
                selected = currentRoute == item.screen.route,
                onClick = {
                    if (currentRoute != item.screen.route) {
                        navController.navigate(item.screen.route) {
                            popUpTo(Screen.Main.route) { inclusive = false }
                            launchSingleTop = true
                        }
                    }
                }
            )
        }
    }
}
