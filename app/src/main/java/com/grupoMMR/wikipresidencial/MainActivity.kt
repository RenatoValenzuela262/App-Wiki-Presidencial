package com.grupoMMR.wikipresidencial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.grupoMMR.wikipresidencial.ui.theme.ProyectoWikiPresidencialTheme
import com.grupoMMR.wikipresidencial.view.navigation.NavigationWrapper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ProyectoWikiPresidencialTheme {
                NavigationWrapper()
            }
        }
    }
}
