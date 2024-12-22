package com.example.jcexampleforstudy.ui.lessonNEKO.les5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.jcexampleforstudy.R
import com.example.jcexampleforstudy.ui.model.ItemColumnModel
import com.example.jcexampleforstudy.ui.model.ItemRowModel

@Composable
fun ItemRow(item: ItemRowModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(3.dp)
            .background(Color.White)

    ) {
        Image(
            painter = painterResource(id = item.imageId),
            contentDescription = stringResource(R.string.item),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(4.dp)
                .size(64.dp)
                .clip(CircleShape)
        )
        Text(text = item.title)
    }
}