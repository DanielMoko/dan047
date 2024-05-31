package com.zack.dan047

import android.content.Intent
import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dan()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Dan(){
    val ok= LocalContext.current
val Greeting = LocalContext.current
    val okay = LocalContext.current
var name by remember {
    mutableStateOf(TextFieldValue(""))}
var email by remember {
    mutableStateOf(TextFieldValue(""))
}

//    Image(
//        modifier = Modifier
//            .fillMaxSize(),
//        contentScale = ContentScale.FillBounds,
//
//
//        painter = painterResource(id = R.drawable.disaster), contentDescription = "image")


   Column(
       modifier = Modifier
//           .background(Color.Transparent)
           .fillMaxWidth()
           .fillMaxHeight()
//           .padding(6.dp)


   ){
       Text(text = "hello im dan",
           fontWeight = FontWeight.Bold
           )
       Spacer(modifier = Modifier
           .height(30.dp),
           )

       Text(text = "another day that im here",
           fontSize = 15.sp,
           color = Color.Blue,
           fontFamily = FontFamily.Cursive,
           fontStyle = FontStyle.Italic,

       )
       Spacer(modifier = Modifier
           .height(50.dp))


Button(onClick = {
                 Greeting.startActivity(Intent(Greeting,HomeActivity::class.java))

},
    colors = ButtonDefaults.buttonColors(Color.Cyan),
    shape = CutCornerShape(5.dp)
) {Text (text = "submit")

    
}

       TextField(
           value = name,
           onValueChange ={ name = it}
       )

       Spacer(modifier = Modifier.height(10.dp))

       OutlinedTextField(value = email ,
           onValueChange = {email = it},
           label = {Text(text = "Email")}
       )


//       AsyncImage(
//           model = "https://coil-kt.github.io/coil/",
//           contentDescription = "image",
//       )

       Button(onClick = {
           okay.startActivity(Intent(okay,CardActivity::class.java))

       },
           colors = ButtonDefaults.buttonColors(Color.Magenta),
           shape = CutCornerShape(5.dp)
       ) {Text (text = "To the card")


       }
       Button(onClick = {
           ok.startActivity(Intent(ok,nav::class.java))

       },
           colors = ButtonDefaults.buttonColors(Color.Magenta),
           shape = CutCornerShape(5.dp)
       ) {Text (text = "To the nav")


       }











































   }

}


