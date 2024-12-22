package com.example.jcexampleforstudy.ui.lessonNEKO.safeArgsNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jcexampleforstudy.ui.model.SettingsData

@Composable
fun SettingScreen(settingsData: SettingsData) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello this is settings")
        Spacer(modifier = Modifier.padding(12.dp))
        Text(text = "enter $")

    }
}