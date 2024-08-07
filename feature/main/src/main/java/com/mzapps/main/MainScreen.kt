package com.mzapps.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {

    Scaffold(
        topBar = {},
        bottomBar = {}
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text("aslkh")
        }
    }
}

@Composable
@Preview (showBackground = true)
private fun MainScreenPreview() {
    MainScreen()

}