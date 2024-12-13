package dev.rene.layoutjetpackcompose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.rene.layoutjetpackcompose.ui.theme.LayoutJetpackComposeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Saludo()
        }
    }
}
@Composable
fun Saludo(){
    Column (
        modifier = Modifier
            .padding(vertical = 36.dp, horizontal = 8.dp)
    ){
        Text(
            text = "Hola",

        )
        Text(
            text = "Mi nombre es Rene Barragan",

        )
    }

}