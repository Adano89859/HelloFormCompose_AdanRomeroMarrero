package com.example.helloformcompose_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloformcompose_2.ui.theme.HelloFormCompose_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //Aquí tengo el setContent
        setContent {
            HelloFormCompose_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }

                //Lamo al HelloForm
                HelloForm()

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloFormCompose_2Theme {
        Greeting("Android")
    }
}


//Creo el HelloForm
@Composable
fun HelloForm(){
    //Creo una variable que contendrá la el nombre, y otra el saludo y que no perderá dicha información
    var nombre by rememberSaveable() { mutableStateOf("") }
    var saludo by rememberSaveable() { mutableStateOf("") }

    //Creo la división en Columna para distribuir los contenidos
    Column(
        modifier = Modifier.padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        //Creo el TextField
        TextField(
            value = nombre,
            label = { Text("Introduce tu nombre") },
            modifier = Modifier.fillMaxWidth(),
            onValueChange = {
                //Aquí, "it" es el texto que el usuario está escribiendo, y por lo tanto se la asigno a la variable nombre
                nombre = it

            },
            //Solo se puede escribir en una línea, no en varias
            singleLine = true

        )

        //Añado un espacio hasta el siguiente elemento
        Spacer(modifier = Modifier.height(24.dp))

        //Creo el Button
        Button(
            modifier = Modifier.fillMaxWidth(),
            //Hago que el botón no esté disponible si no hay texto
            enabled = nombre.isNotBlank(),
            onClick = {

            //Si no hay nombre escrito, pido que introduzca el nombre, sino saludo con el nombre
                if(nombre.isBlank()){
                    saludo = "Introduce tu nombre"
                }else{
                    saludo = "Hola, $nombre"
                }

        }){
            Text("Saludar")
        }

        //Añado un espacio hasta el siguiente elemento
        Spacer(modifier = Modifier.height(24.dp))

        //Creo el Text
        Text(
            text = saludo
        )

    }



}