package com.zack.dan047

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zack.dan047.ui.theme.Dan047Theme

class FAQsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dan047Theme {
                Faqs()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Faqs() {
    Image(
        modifier = Modifier
            .size(300.dp),

        painter = painterResource(id = R.drawable.qnmark), contentDescription = "image")

    Column(
        modifier = Modifier
            .fillMaxSize(),


    ) {
        Text(
            text = "Ask any question that u have?",
            fontFamily = FontFamily.SansSerif,
            color = Color.Blue,
            fontSize = 20.sp
        )
    }
}