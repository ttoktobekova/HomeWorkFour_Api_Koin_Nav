package com.example.jcexampleforstudy.ui.lessonNEKO.les4

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FourListRecVScreen2() {
    LazyColumn (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        itemsIndexed (listOf("item","item2","hello", "good boy", "margin")) {index, item->
            Text(
                text = " $index  $item",
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(vertical = 10.dp)
            )
        }

    }
}