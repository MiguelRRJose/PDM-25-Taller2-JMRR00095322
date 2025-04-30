package com.pdmtaller2.miguelramirez_00095322

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pdmtaller2.miguelramirez_00095322.data.sampleRestaurants
import com.pdmtaller2.miguelramirez_00095322.navigation.AppNavigation
import com.pdmtaller2.miguelramirez_00095322.ui.main.MainScreen
import com.pdmtaller2.miguelramirez_00095322.ui.theme.FootSpotByMiguelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FootSpotByMiguelTheme {
                AppNavigation()
            }
        }
    }
}

