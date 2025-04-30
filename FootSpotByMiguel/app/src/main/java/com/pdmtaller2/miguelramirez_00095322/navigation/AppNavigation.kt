package com.pdmtaller2.miguelramirez_00095322.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.miguelramirez_00095322.data.sampleRestaurants
import com.pdmtaller2.miguelramirez_00095322.ui.main.MainScreen
import com.pdmtaller2.miguelramirez_00095322.ui.menu.MenuScreen
import com.pdmtaller2.miguelramirez_00095322.ui.search.SearchScreen
import com.pdmtaller2.miguelramirez_00095322.ui.orders.OrdersScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        bottomBar = {
            BottomNavigationBar(currentDestination, navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Main.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Main.route) {
                MainScreen(
                    restaurants = sampleRestaurants,
                    onRestaurantClick = {
                        navController.navigate("menu/${it.id}")
                    }
                )
            }
            composable(Screen.Search.route) {
                SearchScreen()
            }
            composable(Screen.Orders.route) {
                OrdersScreen()
            }
            composable("menu/{restaurantId}") { backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toIntOrNull()
                MenuScreen(restaurantId = restaurantId, navController = navController)
            }
        }
    }
}
