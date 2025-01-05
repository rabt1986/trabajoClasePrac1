package dev.rene.layoutjetpackcompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout1(){
    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ),
                title = {
                Text(text = "App bar")
            })
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Magenta,
                shape = CircleShape,
                onClick={}
                ) {
                Text(
                    text = "+",
                    fontSize = 24.sp,
                    color = Color.White
                )
            }
        }
    ) { paddingValues ->
        Box(
                modifier = Modifier.padding(paddingValues)
                .fillMaxSize()
        ){
            Column{
                ItemContact(
                    name = "Jose Galdamez",
                    phoneNumber = "+593991331782"
                )
                ItemContact(
                    name = "tony Stack",
                    phoneNumber = "+593991331782"
                )
            }
        }
    }
}

