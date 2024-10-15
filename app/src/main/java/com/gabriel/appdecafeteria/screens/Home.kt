package com.gabriel.appdecafeteria.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.gabriel.appdecafeteria.viewmodel.ShoppingViewModel

@Composable
fun Home(
    modifier: Modifier = Modifier,
    navController: NavController,
    shoppingViewModel: ShoppingViewModel
) {

    Column(modifier = modifier) {
        Text(text = "Home")
    }
}