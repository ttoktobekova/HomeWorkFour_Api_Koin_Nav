package com.example.jcexampleforstudy.ui.screen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jcexampleforstudy.R
import com.example.jcexampleforstudy.ui.model.PersonModel

@Composable
fun FirstScreen(paddingValues: PaddingValues, onItemClick: (PersonModel) -> Unit) {
    Log.e("tolgonai", "FirstScreen: ")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(color = colorResource(R.color.pink_closed))
    ) {
        //adapter
        LazyColumn(
            modifier = Modifier
                .padding(12.dp)
        ) {
            items(PersonModel.getMockList()) { item ->
                MockItem(
                    item, onItemClick
                )
            }
        }
    }
}

@Composable
fun MockItem(personModel: PersonModel, onItemClick: (PersonModel) -> Unit) {
    val context = LocalContext.current
    Spacer(modifier = Modifier.height(16.dp))
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Green)
            .padding(start = 12.dp)
            .clickable(onClick = {
                onItemClick(personModel)
//                Toast
//                    .makeText(context, "Hello", Toast.LENGTH_SHORT)
//                    .show()
            })
    ) {
        Text(text = "Geeks", fontSize = 18.sp)
        Text(text = personModel.name, fontSize = 18.sp)
        Text(text = personModel.title, fontSize = 18.sp)
        Text(text = personModel.age, fontSize = 18.sp)

    }
}