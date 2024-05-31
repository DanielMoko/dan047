package com.zack.dan047

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zack.dan047.ui.theme.Dan047Theme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ok()

            }
        }
    }

@Preview(showBackground = true)
@Composable
fun Ok(){
    val okay= LocalContext.current

    LazyColumn {
        item {
            Column ( modifier = Modifier
                .fillMaxSize()
            ) {
                Card(
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier
                        .height(350.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()

                    ) {
                        Image(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop,


                            painter = painterResource(id = R.drawable.mariya), contentDescription = "image"
                        )

                    }
                }
                Card(
                    shape = RoundedCornerShape(50.dp),
                    colors = CardDefaults.cardColors(Color.LightGray)

                ){
                    Text(text = "I see a guy rowing his boat to the trees.",
                        modifier = Modifier
                            .padding(15.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15 .sp



                    )

                }
                Card(
                    shape = RoundedCornerShape(19.dp),
                    colors = CardDefaults.cardColors(Color(0xff8d6e63)),
                    modifier = Modifier
                        .height(300.dp),

                    ) {
                    Text(text = "Despite various wars and exoduses, roughly one half of the world's Palestinian population continues to reside in the territory of former Mandatory Palestine, now encompassing Israel and the Palestinian territories of the West Bank and Gaza Strip.[48] In Israel proper, Palestinians constitute almost 21 percent of the population as part of its Arab citizens.[49] Many are Palestinian refugees or internally displaced Palestinians, including more than a million in the Gaza Strip,[50] around 750,000 in the West Bank,[51] and around 250,000 in Israel proper. Of the Palestinian population who live abroad, known as the Palestinian diaspora, more than half are stateless, lacking legal citizenship in any country.",
                        modifier = Modifier,
                        fontSize = 14.sp,
                        color= Color.Cyan

                    )
                }
                Button(onClick = {
                    okay.startActivity(Intent(okay,MainActivity::class.java))

                },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = CutCornerShape(5.dp)
                )
                {Text (text = "To main") }
            }
            }
        }
    }
