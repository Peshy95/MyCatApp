package com.example.catapp.ui.theme.Screens.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.catapp.Navigations.ROUTES_BMICALC
import com.example.catapp.Navigations.ROUTES_CALCULATOR
import com.example.catapp.Navigations.ROUTES_INTENTS
import com.example.catapp.R
import com.example.catapp.ui.theme.CatAppTheme


@Composable
fun HomeScreen(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column (modifier = Modifier
            .padding(bottom = 5.dp)
            .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            , verticalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Welcome to my Home",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 40.sp
                , fontFamily = FontFamily.Cursive,
                textDecoration = TextDecoration.Underline)
        }

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier
                    .height(220.dp)
                    .width(140.dp)
                ,colors = CardDefaults.cardColors(Color.Magenta)

            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                    , verticalArrangement = Arrangement.Center){
                    Icon(painterResource(id = R.drawable.baseline_panorama_photosphere_24)  ,
                        contentDescription = "My icon", modifier = Modifier.size(48.dp))
                    Text(text = "Home")
                }

            }
            Spacer(modifier = Modifier.padding(5.dp))
            Card(
                modifier = Modifier
                    .height(220.dp)
                    .width(140.dp)
                ,colors = CardDefaults.cardColors(Color.Green)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                    , verticalArrangement = Arrangement.Center) {
                    Icon(
                        painterResource(id = android.R.drawable.ic_menu_camera),
                        contentDescription = "My icon", modifier = Modifier.size(48.dp)
                    )
                    Text(text = "Camera")
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {
            Card(
                modifier = Modifier
                    .height(220.dp)
                    .width(140.dp)
                ,  colors = CardDefaults.cardColors(Color.Red)
            ) {

                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                    , verticalArrangement = Arrangement.Center){
                    Icon(painterResource(id = R.drawable.baseline_camera_24)  ,
                        contentDescription = "My icon", modifier = Modifier.size(48.dp))
                    Text(text = "Calculator")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Card(
                modifier = Modifier
                    .height(220.dp)
                    .width(140.dp),
                colors = CardDefaults.cardColors(Color.Yellow)
            ) {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                    , verticalArrangement = Arrangement.Center){
                    Icon(painterResource(id = R.drawable.baseline_emoji_emotions_24)  ,
                        contentDescription = "My icon", modifier = Modifier.size(48.dp))
                    Text(text = "intent")
                }


            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row{
            Button(onClick = { navController.navigate(ROUTES_CALCULATOR) }) {
                Text(text = "Calculator")
            }
            Spacer(modifier = Modifier.padding(3.dp))
            Button(onClick = { navController.navigate(ROUTES_INTENTS) }) {
                Text(text = "Intent")
            }
            Spacer(modifier = Modifier.padding(3.dp))
            Button(onClick = { navController.navigate(ROUTES_BMICALC) }) {

                Text(text = "BmiCalculator")
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    CatAppTheme {
        HomeScreen(rememberNavController())
    }

}
