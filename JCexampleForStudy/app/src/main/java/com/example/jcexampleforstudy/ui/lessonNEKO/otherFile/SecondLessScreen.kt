package com.example.jcexampleforstudy.ui.lessonNEKO.otherFile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SecondLessScreen(name: String, prof: String,img:Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
//            .offset(50.dp, 70.dp)
//            .pointerInput(Unit) {
//                detectDragGesturesAfterLongPress { change, dragAmount ->
//                    Log.d("Toli", "SecondLessScreen: $dragAmount")
//                }
        ,
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(img),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(6.dp)
                        .size(80.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier
                    .padding(start = 12.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}