package com.pdmtaller2.miguelramirez_00095322.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.miguelramirez_00095322.model.Restaurant

@Composable
fun RestaurantSection(
    title: String,
    restaurants: List<Restaurant>,
    onClick: (Restaurant) -> Unit
) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = title,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 8.dp)
        )

        LazyRow {
            items(restaurants) { restaurant ->
                RestaurantCard(restaurant = restaurant, onClick = onClick)
            }
        }
    }
}