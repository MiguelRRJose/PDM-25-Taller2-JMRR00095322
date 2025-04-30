package com.pdmtaller2.miguelramirez_00095322.navigation

sealed class Screen(val route: String, val title: String) {
    object Main : Screen("main", "Inicio")
    object Search : Screen("search", "Buscar")
    object Orders : Screen("orders", "Órdenes")
}

