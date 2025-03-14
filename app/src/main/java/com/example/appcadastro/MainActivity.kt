package com.example.appcadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcadastro.ui.theme.AppCadastroTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appcadastro.ui.theme.Gray10
import com.example.appcadastro.ui.theme.Blue20
import com.example.appcadastro.ui.theme.Brown10
import com.example.appcadastro.ui.theme.Gray10
import com.example.appcadastro.ui.theme.Pink40


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppCadastroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    ProdutoItem()

                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun ProdutoItem(){
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }


    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Gray10)
    ) {

        Box(
            Modifier
                .height(100.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                              Blue20, Brown10
                        )
                    )
                )
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center, true)
        ){
            Image(
                painter = painterResource(id = R.drawable.usuario),
                contentDescription = "Descrição de imagem",
                modifier = Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
                    .size(150.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Blue20, Brown10
                            )
                        )
                    )
            )
        }
        Spacer(modifier = Modifier.height(70.dp))

        Row(
            Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = { Text(text = "Nome: ")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Brown10,
                    unfocusedLabelColor = Blue20,
                    unfocusedContainerColor = Color.Black,
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Brown10,
                    focusedLabelColor = Blue20,
                    focusedContainerColor = Color.Black,
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                )
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = { Text(text = "Telefone: ")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Brown10,
                    unfocusedLabelColor = Blue20,
                    unfocusedContainerColor = Color.Black,
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Brown10,
                    focusedLabelColor = Blue20,
                    focusedContainerColor = Color.Black,
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = curso,
                onValueChange = {curso = it},
                label = { Text(text = "Curso: ")},
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Brown10,
                    unfocusedLabelColor = Blue20,
                    unfocusedContainerColor = Color.Black,
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Brown10,
                    focusedLabelColor = Blue20,
                    focusedContainerColor = Color.Black,
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = serie,
                onValueChange = {serie = it},
                label = { Text(text = "Serie: ") },
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Brown10,
                    unfocusedLabelColor = Blue20,
                    unfocusedContainerColor = Color.Black,
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = Brown10,
                    focusedLabelColor = Blue20,
                    focusedContainerColor = Color.Black,
                    focusedTextColor = Color.White,

                    cursorColor = Color.White
                )
            )
        }
        Button(
            onClick = { /*  */},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .size(height = 60.dp, width = 120.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Enviar",
                color = Blue20,
                fontSize = 20.sp
            )
        }
    }
}