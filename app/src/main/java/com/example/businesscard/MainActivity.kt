package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = Color(0xFFe6ffe6))) {
        Spacer(modifier = Modifier.height(150.dp))
        MainPart()
        Spacer(modifier = Modifier.height(120.dp))
        InfoPart()
    }
}

@Composable
fun MainPart(){
    val androidLogo = painterResource(R.drawable.android_logo)
    val fullName = stringResource(R.string.full_name)
    val title = stringResource(R.string.title)
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = androidLogo,
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(color = Color(0xFF006666))
                .padding(5.dp)
        )
        Text(
            text = fullName,
            fontSize = 55.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = title,
            color = Color(0xFF006622),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )

    }
}

@Composable
fun InfoPart(){
    val call = painterResource(R.drawable.baseline_call_black_24dp)
    val callInfo = stringResource(R.string.call_info)
    val share = painterResource(R.drawable.baseline_share_black_24dp)
    val shareInfo = stringResource(R.string.share_info)
    val mail = painterResource(R.drawable.baseline_mail_outline_black_24dp)
    val mailInfo = stringResource(R.string.mail_info)
    Column {
        Row {
            Image(
                painter = call,
                contentDescription = null,
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp)
            )
            Text(
                text = callInfo,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
            )
        }
        Row {
            Image(
                painter = share,
                contentDescription = null,
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp)
            )
            Text(
                text = shareInfo,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
            )
        }
        Row {
            Image(
                painter = mail,
                contentDescription = null,
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp)
            )
            Text(
                text = mailInfo,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}