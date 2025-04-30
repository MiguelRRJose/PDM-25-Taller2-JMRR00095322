package com.pdmtaller2.miguelramirez_00095322.navigation

sealed class Screen(val route: String, val title: String) {
    object Main : Screen("main", "Restaurantes")
    object Search : Screen("search", "Pantalla de búsqueda")
    object Orders : Screen("orders", "Pantalla de órdenes")
}
