package com.example.uth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uth.ui.screens.*

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(Screen.Splash.route) { SplashScreen(navController) }
        composable(Screen.Onboarding1.route) { OnboardingScreen1(navController) }
        composable(Screen.Onboarding2.route) { OnboardingScreen2(navController) }
        composable(Screen.Onboarding3.route) { OnboardingScreen3(navController) }
        composable(Screen.DataFlow.route) { DataFlowScreen(navController) } 
    }
}

