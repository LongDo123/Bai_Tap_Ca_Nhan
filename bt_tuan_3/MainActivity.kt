package com.example.homework3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.*
import com.example.homework3.ui.theme.Homework3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homework3Theme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "onboarding") {
                    composable("onboarding") {
                        OnboardingScreen(navController)
                    }
                    composable("components") {
                        ComponentListScreen(navController)
                    }
                    composable("text_detail") {
                        TextDetailScreen(navController)
                    }
                    composable("image_detail") {
                        ImageDetailScreen(navController)
                    }
                    composable("textfield_detail") {
                        TextFieldDetailScreen(navController)
                    }
                    composable("passwordfield_detail") {
                        PasswordFieldDetailScreen(navController)
                    }
                    composable("row_layout") {
                        RowLayoutScreen(navController)
                    }
                    composable("column_layout") {
                        ColumnLayoutScreen(navController)
                    }


                }
            }
        }
    }
}
