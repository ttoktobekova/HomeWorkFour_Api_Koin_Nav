package com.example.jcexampleforstudy.ui.lessonNEKO.les6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jcexampleforstudy.R
import com.example.jcexampleforstudy.ui.model.ItemColumnModel
import com.example.jcexampleforstudy.ui.theme.Gray100

@Composable
fun FiveRVRowScreen() {

    LazyColumn(
        modifier = Modifier
            .background(Gray100)
            .fillMaxWidth()
            .padding(3.dp)
    ) {
        itemsIndexed(
            listOf(
                ItemColumnModel(
                    R.drawable.img_cat_cute_love_couples,
                    "Love",
                    "karaokgfgmfkgfgfnjdfbnjdgnbikbgfnhklbljdlkjdlkgjtiohjofgjkhngknfm,gnklfgmb,mghklnrgfohjmnbgfkvmnklfmlkfhjmkghjotihjtolfgjnopl;fgknl;fghkpoethdglohjldhjdlhjdjddjhdthjopooopohfe"
                ),
                ItemColumnModel(R.drawable.img_laziness, "Laziness", "karaoke"),
                ItemColumnModel(R.drawable.img_1, "Cat Cute", "karaoke"),
                ItemColumnModel(R.drawable.img_still_cute, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_your_my_paradise, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_word, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_cat_cute_love_couples, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_laziness, "Laziness", "karaoke"),
                ItemColumnModel(R.drawable.img_1, "Cat Cute", "karaoke"),
                ItemColumnModel(R.drawable.img_still_cute, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_your_my_paradise, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_word, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_cat_cute_love_couples, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_laziness, "Laziness", "karaoke"),
                ItemColumnModel(R.drawable.img_1, "Cat Cute", "karaoke"),
                ItemColumnModel(R.drawable.img_still_cute, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_your_my_paradise, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_word, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_cat_cute_love_couples, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_laziness, "Laziness", "karaoke"),
                ItemColumnModel(R.drawable.img_1, "Cat Cute", "karaoke"),
                ItemColumnModel(R.drawable.img_still_cute, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_your_my_paradise, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_word, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_cat_cute_love_couples, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_laziness, "Laziness", "karaoke"),
                ItemColumnModel(R.drawable.img_1, "Cat Cute", "karaoke"),
                ItemColumnModel(R.drawable.img_still_cute, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_your_my_paradise, "Love", "karaoke"),
                ItemColumnModel(R.drawable.img_word, "Love", "karaoke"),

                )
        )
        { index, item ->
            ItemRow(item = item)
        }

    }
}