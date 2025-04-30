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
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            MenuItem(1, "Taco al Pastor", "Tortilla suave con carne de cerdo marinada al estilo pastor.", R.drawable.taco),
            MenuItem(2, "Quesadilla", "Tortilla rellena de queso fundido, servida caliente.", R.drawable.taco)
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza Bella",
        description = "Auténticos sabores italianos con un toque artesanal.",
        imageResId = R.drawable.italiana,
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
        imageResId = R.drawable.asiatica,
        categories = listOf("Comida Asiática", "Comida Saludable"),
        menu = listOf(
            MenuItem(5, "Sushi Roll", "Rollos de arroz rellenos de pescado fresco y vegetales.", R.drawable.su),
            MenuItem(6, "Ramen", "Sopa japonesa con fideos, caldo intenso y toppings variados.", R.drawable.ramen),
            MenuItem(7, "Sushi Pollo", "Rollos de arroz rellenos de pescado fresco y vegetales.", R.drawable.su),
            MenuItem(8, "Sushi Platano", "Rollos de arroz rellenos de pescado fresco y vegetales.", R.drawable.su),



            )
    ),
    Restaurant(
        id = 4,
        name = "Salud y Sabor",
        description = "Comidas saludables sin perder el sabor.",
        imageResId = R.drawable.saludable,
        categories = listOf("Comida Saludable"),
        menu = listOf(
            MenuItem(7, "Ensalada Verde", "Mezcla de hojas verdes, aguacate y semillas con aderezo natural.", R.drawable.verde)
        )
    ),
    Restaurant(
        id = 5,
        name = "Dulce Final",
        description = "Postres irresistibles para cerrar con broche de oro.",
        imageResId = R.drawable.dulce,
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            MenuItem(8, "Cheesecake", "Tarta de queso cremosa sobre base crocante, decorada con frutas.", R.drawable.ches)
        )
    ),
    Restaurant(
        id = 6,
        name = "Refrescos Ya!",
        description = "Bebidas frías para refrescar tu día.",
        imageResId = R.drawable.bebidas,
        categories = listOf("Bebidas"),
        menu = listOf(
            MenuItem(9, "Limonada", "Limonada natural con hierbabuena, servida con hielo.", R.drawable.limonada)
        )
    ),

    Restaurant(
        id = 7,
        name = "Burger Rush",
        description = "Las hamburguesas más rápidas y sabrosas de la ciudad.",
        imageResId = R.drawable.rapido,
        categories = listOf("Comida Rápida"),
        menu = listOf(
            MenuItem(10, "Hamburguesa Clásica", "Carne jugosa, queso, lechuga y tomate en pan suave.", R.drawable.hamburguesaclasic),
            MenuItem(11, "Papas Fritas", "Papas doradas, crujientes por fuera y suaves por dentro.", R.drawable.papas),
            MenuItem(12, "Combo Doble", "Doble hamburguesa + papas + bebida.", R.drawable.combo)
    )
)

)
