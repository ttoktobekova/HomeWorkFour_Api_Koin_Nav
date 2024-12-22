package com.example.jcexampleforstudy.ui.lessonNEKO.otherFile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//          Box(modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                CircleItem()
//            }

@Composable
fun CircleItem() {
    val counter = remember {
        mutableStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.DarkGray)
    }
    Box(
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
            .background(color = color.value)
            .clickable {
                when(++counter.value){
                    10->color.value = Color.Red
                    11->color.value = Color.DarkGray
                    20->color.value = Color.Green
                    21->color.value = Color.DarkGray

                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = counter.value.toString(),
            style = TextStyle(color = Color.White, fontSize = 20.sp)
        )
    }
}

//fun ThreeLesScreen(name: String, prof: String, img_your_my_paradise: Int) {
//    var counter = remember {
//        mutableStateOf(0)
//    }
//    var colorState = remember {
//        mutableStateOf(Color.DarkGray)
//    }
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(color = colorState.value, shape = CircleShape)
//            .clickable {
//                counter.value++
//            },
//        shape = RoundedCornerShape(16.dp),
//        elevation = CardDefaults.cardElevation(4.dp)
//    ) {
//        Box() {
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Image(
//                    painter = painterResource(img_your_my_paradise),
//                    contentDescription = "img_your_my_paradise",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .padding(6.dp)
//                        .size(80.dp)
//                        .clip(CircleShape)
//                )
//                Column(
//                    modifier = Modifier
//                        .padding(start = 12.dp)
//                ) {
//                    Text(text = counter.value.toString(), fontSize = 24.sp)
//                    Text(text = prof)
//                }
//            }
//        }
//    }
//
//}