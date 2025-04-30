package com.pdmtaller2.miguelramirez_00095322.data

import com.pdmtaller2.miguelramirez_00095322.R
import com.pdmtaller2.miguelramirez_00095322.model.MenuItem
import com.pdmtaller2.miguelramirez_00095322.model.Restaurant
val sampleRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Taco Fiesta",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Mexicana", "Comida Rápida"),
        menu = listOf(
            MenuItem(1, "Taco al Pastor", "Taco con carne marinada", R.drawable.taco),
            MenuItem(2, "Quesadilla", "Queso derretido en tortilla", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza Bella",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Italiana"),
        menu = listOf(
            MenuItem(3, "Pizza Margarita", "Tomate y albahaca", R.drawable.taco),
            MenuItem(4, "Lasagna", "Capas de pasta y carne", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 3,
        name = "Bento Box",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Asiática", "Comida Saludable"),
        menu = listOf(
            MenuItem(5, "Sushi Roll", "Rollos de arroz", R.drawable.taco),
            MenuItem(6, "Ramen", "Sopa japonesa", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 4,
        name = "Salud y Sabor",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Saludable"),
        menu = listOf(
            MenuItem(7, "Ensalada Verde", "Lechuga, espinaca y aguacate", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 5,
        name = "Dulce Final",
        imageResId = R.drawable.taco,
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            MenuItem(8, "Cheesecake", "Tarta de queso", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 6,
        name = "Refrescos Ya!",
        imageResId = R.drawable.taco,
        categories = listOf("Bebidas"),
        menu = listOf(
            MenuItem(9, "Limonada", "Con hierbabuena", R.drawable.taco)
        )
    )
)
