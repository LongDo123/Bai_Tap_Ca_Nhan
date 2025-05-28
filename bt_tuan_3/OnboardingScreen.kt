package com.example.homework3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign



@Composable
fun OnboardingScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_logo),
            contentDescription = "Logo",
            modifier = Modifier.size(150.dp)
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Jetpack Compose", style = MaterialTheme.typography.titleLarge)
            Text("Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.", textAlign = TextAlign.Center)
        }
        Button(
            onClick = { navController.navigate("components") },
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 32.dp)
                .padding(bottom = 32.dp)
        ) {
            Text("I'm ready")
        }
    }
}
