package dev.rene.layoutjetpackcompose.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout (){
    Scaffold { paddingValues ->
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.padding(paddingValues)
                .background(color = Color.Yellow)
                .fillMaxSize()
        ){
            Box(
                modifier = Modifier.padding(25.dp)
            ){
                Box(
                    modifier = Modifier.size(75.dp)
                        .background(color = Color.Green)
                        .padding(25.dp)
                ){

                }
            }
        }
    }
}