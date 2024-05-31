package com.zack.dan047

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zack.dan047.ui.theme.Dan047Theme
import org.w3c.dom.Text
import androidx.compose.material3.Icon as Icon
import androidx.compose.material3.Text as Text1

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Hello()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Hello(){
    val create= LocalContext.current
    val Greet= LocalContext.current
    val help = LocalContext.current
    var name by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var describe by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Image(
        modifier = Modifier
            .fillMaxSize(),
                contentScale = ContentScale.FillBounds,

        painter = painterResource(id = R.drawable.emoji), contentDescription = "image")

    LazyColumn()
{
    item{


Column(
    modifier = Modifier


        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
){


    Row {
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(id = R.drawable.login), contentDescription = "image")

    }
    Spacer(modifier = Modifier
        .height(10.dp))
    Text1(text = "LOGIN",
           fontWeight = FontWeight.ExtraBold
        )


    Spacer(modifier = Modifier
        .height(25.dp))

    OutlinedTextField(
        shape = RoundedCornerShape(50.dp),
        value = name,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            unfocusedLabelColor = Color.Black,
            focusedLabelColor = Color.Green,
            unfocusedContainerColor = Color.LightGray
        ),
        onValueChange ={ name = it},
         label =  { Text(text = "name")},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Person,
                contentDescription = "personicon")
        }

    )

    Spacer(modifier = Modifier.height(15.dp))

    OutlinedTextField(
        visualTransformation = PasswordVisualTransformation() ,
        shape = RoundedCornerShape(50.dp),
        value = password,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            unfocusedLabelColor = Color.Black,
            focusedLabelColor = Color.Green,
            unfocusedContainerColor = Color.LightGray
        ),
        onValueChange ={password = it},
        label = { Text(text = "Password") },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Lock,
                contentDescription = "Icon") }


        )
    Spacer(modifier = Modifier
        .height(25.dp))
    OutlinedTextField (
        modifier = Modifier .height(100.dp),
        shape = RoundedCornerShape(50.dp),
        value = describe,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            unfocusedLabelColor = Color.Black,
            focusedLabelColor = Color.Green,
            unfocusedContainerColor = Color.LightGray
        ),
    onValueChange = {describe= it},
    label = {Text(text = "Description")},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Edit,
                contentDescription = "Icon") }




    )
    Button(onClick = { Greet.startActivity(Intent(Greet,MainActivity::class.java)) },
        colors = ButtonDefaults.buttonColors(Color.Cyan),
        shape = CutCornerShape(5.dp))
     {Text (text = "login") }
    Spacer(modifier = Modifier
        .height(50.dp))
    Text(text = "Forgot Password??",
 modifier = Modifier
     .clickable(onClick ={ help.startActivity(Intent(help,ContactActivity::class.java))

     } )

        )
    Spacer(modifier = Modifier
        .height(50.dp))

    Text(text = "OR",
        )
    Spacer(modifier = Modifier
        .height(50.dp))
Text(text = "Not a member?Sign up.",
    modifier = Modifier
        .clickable(onClick ={create.startActivity(Intent(create,ContactActivity::class.java))} )

    )


}
    }
}
}