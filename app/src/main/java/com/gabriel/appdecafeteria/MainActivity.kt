package com.gabriel.appdecafeteria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gabriel.appdecafeteria.screens.Home
import com.gabriel.appdecafeteria.screens.Shopping
import com.gabriel.appdecafeteria.viewmodel.ShoppingViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            val shoppingViewModel: ShoppingViewModel = hiltViewModel()

            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                composable("Home") {
                    Home(
                        modifier = Modifier,
                        navController = navController,
                        shoppingViewModel = shoppingViewModel
                    )
                }
                composable("Shopping") {
                    Shopping()
                }
            }
        }
    }
}