package com.example.jcexampleforstudy.ui.fununction

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun SecondWidth() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp

    // Используем Row для равномерного распределения ширины
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .height(150.dp)
                .width(screenWidth / 3)
        )

        Box(
            modifier = Modifier
                .background(Color.Gray)
                .height(150.dp)
                .width(screenWidth / 3)
        ) {
            // Вложенный Row для Text и TextField
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "Geek",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp), // Установим фиксированную высоту для TextField
                    value = "Geek",
                    onValueChange = {},
                    textStyle = TextStyle(fontSize = 24.sp),
                    placeholder = {
                        Text(
                            text = "Enter text here",
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Blue // Подсказка теперь будет синего цвета
                        )
                    },
                )
            }
        }

        // Третий Box, который не сдвигается
        Box(
            modifier = Modifier
                .background(Color.White)
                .height(150.dp)
                .width(screenWidth / 3)
        )
    }
}
