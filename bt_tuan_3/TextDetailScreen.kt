package com.example.homework3

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextDetailScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = {
                Text(
                    text = "Text Detail",
                    color = Color(0xFF007AFF)
                )
            },
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF007AFF)
                    )
                }
            }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle()) { append("The ") }
                withStyle(
                    style = SpanStyle(textDecoration = TextDecoration.LineThrough)
                ) { append("quick ") }
                withStyle(
                    style = SpanStyle(color = Color(0xFFB86F11), fontSize = 28.sp)
                ) { append("Brown\n") }

                append("fox ")
                append("j ")
                append("u ")
                append("m ")
                append("p ")
                append("s ")

                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("over\n")
                }

                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("the ")
                }
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic)) {
                    append("lazy ")
                }
                append("dog.")
            },
            fontSize = 24.sp,
            lineHeight = 36.sp,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}
