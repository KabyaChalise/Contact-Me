package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppContent()
        }
    }
}

@Preview
@Composable
fun AppContent() {
    ContentHolder(
        name = stringResource(id = R.string.name),
        job = stringResource(id = R.string.job),
        number = stringResource(id = R.string.num),
        quote = stringResource(id = R.string.quote),
        gmail = stringResource(id = R.string.email),
        img = painterResource(id = R.drawable.android_logo)
    )
}

@Composable
private fun ContentHolder(
    name: String,
    job: String,
    number: String,
    quote: String,
    gmail: String,
    img: Painter
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD1E7D3)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.padding(0.dp, 220.dp, 0.dp, 180.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = img,
                contentDescription = null,
                modifier = Modifier
                    .background(Color(0xFF073042))
                    .size(120.dp),

                )
            Text(
                text = name,
                modifier = Modifier.padding(10.dp),
                fontSize = 40.sp,
                fontStyle = FontStyle.Normal
            )
            Text(
                text = job,
                fontSize = 15.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF5EA07C)
            )
        }
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxHeight(.6f)
                .padding(10.dp, 0.dp, 0.dp, 0.dp)

        ) {
            Row(
            ) {
                Icon(
                    Icons.Filled.Phone,
                    contentDescription = null,
                    tint = Color(0xFF006D3A)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = number,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Row {
                Icon(
                    Icons.Filled.Share,
                    contentDescription = null,
                    tint = Color(0xFF026E3C)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = quote,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Row {
                Icon(
                    Icons.Filled.Email,
                    contentDescription = null,
                    tint = Color(0xFF006D3B)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    text = gmail,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

