package com.example.venkey_mad_23012531078_pra_5

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_23012531027_practical5.sereen.LoginScreen
import com.example.mad_23012531027_practical5.sereen.RegisterScreen

@Composable
fun AppNavigation(context: Context){
    val navcontroller = rememberNavController()

    NavHost(navcontroller, startDestination = "login"){
        composable("login"){
            LoginScreen(context, navcontroller)
        }
        composable("register"){
            RegisterScreen(context, navcontroller)
        }

    }
}