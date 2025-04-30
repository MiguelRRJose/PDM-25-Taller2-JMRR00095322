package com.pdmtaller2.miguelramirez_00095322.data

import com.pdmtaller2.miguelramirez_00095322.R
import com.pdmtaller2.miguelramirez_00095322.model.MenuItem
import com.pdmtaller2.miguelramirez_00095322.model.Restaurant

val sampleRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Taco Fiesta",
        description = "Deliciosos tacos mexicanos con recetas tradicionales.",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Mexicana", "Comida Rápida"),
        menu = listOf(
            MenuItem(1, "Taco al Pastor", "Tortilla suave con carne de cerdo marinada al estilo pastor.", R.drawable.taco),
            MenuItem(2, "Quesadilla", "Tortilla rellena de queso fundido, servida caliente.", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza Bella",
        description = "Auténticos sabores italianos con un toque artesanal.",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Italiana"),
        menu = listOf(
            MenuItem(3, "Pizza Margarita", "Pizza clásica con salsa de tomate, queso mozzarella y albahaca fresca.", R.drawable.taco),
            MenuItem(4, "Lasagna", "Capas de pasta con carne, salsa bechamel y queso gratinado.", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 3,
        name = "Bento Box",
        description = "Sabores japoneses frescos y balanceados para el día a día.",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Asiática", "Comida Saludable"),
        menu = listOf(
            MenuItem(5, "Sushi Roll", "Rollos de arroz rellenos de pescado fresco y vegetales.", R.drawable.taco),
            MenuItem(6, "Ramen", "Sopa japonesa con fideos, caldo intenso y toppings variados.", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 4,
        name = "Salud y Sabor",
        description = "Comidas saludables sin perder el sabor.",
        imageResId = R.drawable.taco,
        categories = listOf("Comida Saludable"),
        menu = listOf(
            MenuItem(7, "Ensalada Verde", "Mezcla de hojas verdes, aguacate y semillas con aderezo natural.", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 5,
        name = "Dulce Final",
        description = "Postres irresistibles para cerrar con broche de oro.",
        imageResId = R.drawable.taco,
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            MenuItem(8, "Cheesecake", "Tarta de queso cremosa sobre base crocante, decorada con frutas.", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 6,
        name = "Refrescos Ya!",
        description = "Bebidas frías para refrescar tu día.",
        imageResId = R.drawable.taco,
        categories = listOf("Bebidas"),
        menu = listOf(
            MenuItem(9, "Limonada", "Limonada natural con hierbabuena, servida con hielo.", R.drawable.taco)
        )
    )
)
