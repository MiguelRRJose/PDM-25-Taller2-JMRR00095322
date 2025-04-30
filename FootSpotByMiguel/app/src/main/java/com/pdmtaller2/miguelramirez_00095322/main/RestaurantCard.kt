package com.pdmtaller2.miguelramirez_00095322.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.miguelramirez_00095322.model.Restaurant

@Composable
fun RestaurantCard(
    restaurant: Restaurant,
    onClick: (Restaurant) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(160.dp)
            .clickable { onClick(restaurant) },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = restaurant.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = restaurant.name,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                fontSize = 14.sp,
                maxLines = 1
            )
        }
    }
}
