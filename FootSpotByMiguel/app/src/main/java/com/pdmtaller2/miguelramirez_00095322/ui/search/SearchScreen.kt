package com.pdmtaller2.miguelramirez_00095322.ui.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.miguelramirez_00095322.data.sampleRestaurants
import com.pdmtaller2.miguelramirez_00095322.model.Restaurant

@Composable
fun SearchScreen(navController: NavController) {
    var query by remember { mutableStateOf("") }

    val filteredRestaurants = remember(query) {
        val lowerQuery = query.lowercase()
        sampleRestaurants.filter { restaurant ->
            restaurant.name.lowercase().contains(lowerQuery) ||
                    restaurant.categories.any { it.lowercase().contains(lowerQuery) } ||
                    restaurant.menu.any { it.name.lowercase().contains(lowerQuery) }
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Buscar por nombre, platillo o categoría") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        LazyColumn {
            items(filteredRestaurants) { restaurant ->
                SearchResultItem(restaurant = restaurant) {
                    navController.navigate("menu/${restaurant.id}")
                }
            }
        }
    }
}

@Composable
fun SearchResultItem(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = restaurant.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 8.dp)
            )

            Column {
                Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium)
                Text(text = restaurant.description, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
