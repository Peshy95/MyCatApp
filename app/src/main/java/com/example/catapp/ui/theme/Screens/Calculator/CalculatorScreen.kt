package com.example.catapp.ui.theme.Screens.Calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.OutlinedTextField

import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen(navController: NavHostController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(15.dp)
        ){
            Text(text = "Calculator")
            FontWeight.Bold
        }

        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            var firstNumber by remember {
                mutableStateOf("")
            }
            OutlinedTextField(value = firstNumber, onValueChange = {firstNumber = it},
                label = { Text(text = " Enter Value")},
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            var secondNumber by remember {
                mutableStateOf("")
            }
            OutlinedTextField(value = secondNumber, onValueChange = {secondNumber = it},
                label = { Text(text = "Enter value")},
                modifier = Modifier.fillMaxWidth(0.9f),
                shape = RoundedCornerShape(20.dp)
            )

            var result by remember {
                mutableStateOf("0")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row (modifier = Modifier,
                horizontalArrangement = Arrangement.SpaceEvenly){

                Button(onClick = {
                    val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                    val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                    result = (num1 + num2).toString()
                }
                ) {
                    Text(text = "+",
                        fontWeight = FontWeight.Black)
                }
                Spacer(modifier = Modifier.padding(3.dp))
                Button(onClick = {
                    val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                    val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                    result = (num1 * num2).toString()
                }
                ) {
                    Text(text = "x",
                        fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.padding(3.dp))

                Button(onClick = {
                    val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                    val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                    result = (num1 / num2).toString()
                }
                ) {
                    Text(text = "/",
                        fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.padding(3.dp))

                Button(onClick = {
                    val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                    val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                    result = (num1 - num2).toString()
                },
                    modifier = Modifier

                        .padding(top = 3.dp)
                ) {
                    Text(text = "-",
                        fontWeight = FontWeight.Bold)
                }

            }

            Column (modifier = Modifier, verticalArrangement = Arrangement.Bottom){
                Text(text = "result: $result",
                    fontFamily = FontFamily.Default,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun calcScreenPreview(){
    CalculatorScreen(rememberNavController())
}