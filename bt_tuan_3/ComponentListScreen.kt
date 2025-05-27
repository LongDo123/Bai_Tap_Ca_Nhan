package com.example.homework3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.clickable



@Composable
fun ComponentListScreen(navController: NavController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "UI Components List",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color(0xFF007AFF),
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Section(title = "Display") {
                UIComponentItem(title = "Text", description = "Displays text", onClick = { navController.navigate("text_detail") })
                UIComponentItem(title = "Image", description = "Displays an image", onClick = { navController.navigate("image_detail") })
            }

            Section(title = "Input") {
                UIComponentItem(title = "TextField", description = "Input field for text", onClick = { navController.navigate("textfield_detail") })
                UIComponentItem(title = "PasswordField", description = "Input field for passwords", onClick = { navController.navigate("passwordfield_detail") })
            }

            Section(title = "Layout") {
                UIComponentItem(title = "Column", description = "Arranges elements vertically", onClick = { navController.navigate("column_layout") })
                UIComponentItem(title = "Row", description = "Arranges elements horizontally", onClick = { navController.navigate("row_layout") })
            }
        }
    }
}


@Composable
fun UIComponentItem(title: String, description: String, onClick: (() -> Unit)? = null) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(color = Color(0xFFB3E5FC), shape = RoundedCornerShape(8.dp))
            .clickable(enabled = onClick != null) { onClick?.invoke() }
            .padding(12.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0D47A1)
            )
        )
        Text(
            text = description,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black
        )
    }
}
@Composable
fun Section(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            content = content
        )
    }
}

