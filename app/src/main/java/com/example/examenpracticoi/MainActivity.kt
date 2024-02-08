package com.example.examenpracticoi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examenpracticoi.ui.theme.ExamenPracticoITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenPracticoITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Logo()
                    Contacto(1, "Zaragosa #213 Zona Centro, Calvillo Ags.")
                    Contacto(2, "Blvd. Rodolfo Landeros #150, Calvillo Ags.")
                    Contacto(3, "Av. Aguascalientes Sur #436 Local 9-A, Col. España, Ags.")
                }
            }
        }
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.cacahuazintle)
    Box(
        modifier = modifier
            .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.TopCenter)
        )
    }
}

@Composable
fun Contacto(sucursal: Int, direccion: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Suc. $sucursal: $direccion",
            fontSize = 26.sp,
            lineHeight = 60.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenPracticoITheme {
        //Greeting("Android")
    }
}