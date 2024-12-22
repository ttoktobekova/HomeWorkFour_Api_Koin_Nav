package com.example.jcexampleforstudy.ui.lessonNEKO.otherFile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MainScreen() {
    Row (horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxWidth().fillMaxHeight(0.5f),){
        Column(
            modifier = Modifier
            .background(Color.Blue)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Hello1")
            Text("Hello2")
            Text("Hello3")
        }
        Column( modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text("Hello1")
            Text("Hello2")
            Text("Hello3")
        }
    }

}