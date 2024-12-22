package com.example.jcexampleforstudy.ui.lessonNEKO.les5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jcexampleforstudy.R
import com.example.jcexampleforstudy.ui.model.ItemRowModel
import com.example.jcexampleforstudy.ui.theme.Gray100

@Composable
fun FourRVRowScreen() {
    LazyRow(
        modifier = Modifier
            .background(Gray100)
            .fillMaxWidth()
    ) {
        itemsIndexed(
            listOf(
                ItemRowModel(R.drawable.img_cat_cute_love_couples, "Love"),
                ItemRowModel(R.drawable.img_laziness, "Laziness"),
                ItemRowModel(R.drawable.img_1, "Cat Cute"),
                ItemRowModel(R.drawable.img_still_cute, "Love"),
                ItemRowModel(R.drawable.img_your_my_paradise, "Love"),
                ItemRowModel(R.drawable.img_word, "Love"),

                )
        )
        { index, item ->
            ItemRow(item = item)
        }

    }
}