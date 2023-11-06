package com.example.catapp.Navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.catapp.ui.theme.Screens.BmiCal.BmiCalculator
import com.example.catapp.ui.theme.Screens.Calculator.CalculatorScreen
import com.example.catapp.ui.theme.Screens.Home.HomeScreen
import com.example.intentsapp.IntentScreen

@Composable
fun AppNavHost(modifier : Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTES_HOME)
{
    NavHost(navController = navController,
        modifier=Modifier , startDestination = startDestination )
    {
        composable(ROUTES_HOME){
            HomeScreen(navController = navController)
        }
        composable(ROUTES_INTENTS){
         IntentScreen(navController=navController)
        }
        composable(ROUTES_BMICALC){
          BmiCalculator(navController = navController)
        }
        composable(ROUTES_CALCULATOR){
            CalculatorScreen(navController = navController)
        }
    }
}




