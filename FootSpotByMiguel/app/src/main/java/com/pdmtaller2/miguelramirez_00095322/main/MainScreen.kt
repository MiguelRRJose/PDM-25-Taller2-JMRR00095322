package com.pdmtaller2.miguelramirez_00095322.ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.miguelramirez_00095322.model.Restaurant

@Composable
fun MainScreen(
    restaurants: List<Restaurant>,
    onRestaurantClick: (Restaurant) -> Unit
) {
    val categories = restaurants
        .flatMap { it.categories }
        .distinct()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 8.dp)
    ) {
        categories.forEach { category ->
            item {
                RestaurantSection(
                    title = category,
                    restaurants = restaurants.filter { it.categories.contains(category) },
                    onClick = onRestaurantClick
                )
            }
        }
    }
}
