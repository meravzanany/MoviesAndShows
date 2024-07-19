package com.mzapps.moviesandshows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mzapps.main.MainScreen
import com.mzapps.ui.MoviesAndShowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoviesAndShowsTheme {
                MainScreen()
            }
        }
    }
}