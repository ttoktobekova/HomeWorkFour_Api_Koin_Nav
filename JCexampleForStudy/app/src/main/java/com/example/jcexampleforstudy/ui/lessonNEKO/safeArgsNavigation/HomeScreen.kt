package com.example.jcexampleforstudy.ui.lessonNEKO.safeArgsNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.jcexampleforstudy.R

@Composable
fun HomeScreen(onSettingsClick: () -> Unit) {
    val textState = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = textState.value,
            onValueChange = {textState.value = it},
            label = { Text("Enter text") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {
            onSettingsClick()
        }) {
            Text(
                text = (stringResource(R.string.go_to_screen))
            )
        }
    }
}

//один из способов для передачи данных но это не очень практичен
// setContent() {
//            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                val navController = rememberNavController()
//                NavHost(navController, startDestination = "home") {
//                    composable("home") {
//                        HomeScreen {
//                            navController.navigate("settings/12345")
//                        }
//                    }
//                    composable("settings/{id}") { backStackEntry ->
//                        val id = backStackEntry.arguments?.getString("id") ?: ""
//                        SettingScreen(id = id)
//                    }
//                }
//            }
//        }
//  Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = stringResource(R.string.hello_this_is_home_screen)
//        )
//        Spacer(modifier = Modifier.padding(10.dp))
//        Button(onClick = {
//            onSettingsClick()
//        }) {
//            Text(
//                text = (stringResource(R.string.go_to_screen))
//            )
//        }
//    }

//@Composable
//fun SettingScreen(id: String) {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = "Hello this is settings"
//        )
//        Spacer(modifier = Modifier.padding(12.dp))
//        Text(text = "Every one hello : $id")
//    }
//}


