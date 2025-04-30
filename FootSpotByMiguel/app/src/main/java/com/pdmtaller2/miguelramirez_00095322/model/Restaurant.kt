package com.pdmtaller2.miguelramirez_00095322.model

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageResId: Int,
    val categories: List<String>,
    val menu: List<MenuItem>
)
