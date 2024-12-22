package com.example.jcexampleforstudy

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.jcexampleforstudy.ui.lessonNEKO.safeArgsNavigation.Home
import com.example.jcexampleforstudy.ui.lessonNEKO.safeArgsNavigation.HomeScreen
import com.example.jcexampleforstudy.ui.lessonNEKO.safeArgsNavigation.SettingScreen
import com.example.jcexampleforstudy.ui.model.SettingsData

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                val navController = rememberNavController()
                NavHost(
                    navController,
                    startDestination = Home,
                    modifier = Modifier.padding(innerPadding)
                ) {
                    composable<Home> {
                        HomeScreen {
                            navController.navigate(
                                SettingsData(
                                    text =
                                )
                            )
                        }
                    }
                    composable<SettingsData> { backStackEntry ->
                        val settingsData = backStackEntry.toRoute<SettingsData>()
                        SettingScreen(settingsData)
                    }
                }
            }
        }
    }
}

//            val currentScreen = remember { mutableStateOf(NavScreen.First) }
//            ThreeLesScreen("Name","Oscar",R.drawable.img_cute_cat)
//            JCExampleForStudyTheme {
//                val systemUiController = r    ememberSystemUiController()
//                systemUiController.setSystemBarsColor(
//                    color = colorResource(R.color.gray)
//                )
//                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_cute_cat)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_cute_cat)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_your_my_paradise)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_word)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_back_logo)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_cute_cat)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_cute_cat)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_your_my_paradise)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_word)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_back_logo)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen ("Allax", "Alxxamdullilax!", R.drawable.img_cute_cat)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_cute_cat)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_your_my_paradise)
//                    SecondLessScreen("Allax", "Alxxamdullilax!", R.drawable.img_word)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_back_logo)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//                    SecondLessScreen("Bakai", "Father", R.drawable.ic_launcher_background)
//
//                }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//                //                Scaffold { padding ->
////                    when (currentScreen.value) {
////                        NavScreen.First -> {
////                            FirstScreen(padding, onItemClick = {
////                                currentScreen.value = NavScreen.Second
////                            })
////                        }
////
////                        NavScreen.Second -> {
////                            SecondScreen(padding)
////                        }
////                    }
////
////                }
//
//            }






