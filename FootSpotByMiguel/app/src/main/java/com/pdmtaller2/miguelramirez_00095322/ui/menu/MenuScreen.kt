package com.pdmtaller2.miguelramirez_00095322.ui.menu

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.miguelramirez_00095322.data.sampleRestaurants
import com.pdmtaller2.miguelramirez_00095322.model.MenuItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(restaurantId: Int?, navController: NavController) {
    val restaurant = sampleRestaurants.find { it.id == restaurantId }
    val context = LocalContext.current

    var searchText by remember { mutableStateOf("") }

    val filteredMenu = remember(searchText) {
        restaurant?.menu?.filter {
            it.name.contains(searchText, ignoreCase = true)
        } ?: emptyList()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurant?.name ?: "Menú") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")

                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {

            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Buscar platillo") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            LazyColumn {
                items(filteredMenu) { dish ->
                    DishItem(dish = dish) {
                        Toast
                            .makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }
    }
}

@Composable
fun DishItem(dish: MenuItem, onAddToCart: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = dish.imageResId),
                contentDescription = dish.name,
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
            )

            Column(modifier = Modifier.weight(1f)) {
                Text(text = dish.name, style = MaterialTheme.typography.titleMedium)
                Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
            }

            Button(
                onClick = onAddToCart,
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Agregar")
            }
        }
    }
}
