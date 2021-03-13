package com.example.androiddevchallenge.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.BackgroundScreen
import com.example.androiddevchallenge.ui.theme.MyTheme


/**
 * Created by Kevin Macharia on 3/13/21.
 * Turnkey Africa LTD
 * kevin.macharia@turnkeyafrica.com
 */

@Composable
fun WelcomeScreen(
    onClickLogin: () -> Unit = {},
    onClickSignup: () -> Unit = {}
) {
    Surface(color = MaterialTheme.colors.background) {
        BackgroundScreen(painterRes = R.drawable.ic_welcome) {
            Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = null)
            Button(
                onClick = onClickSignup,
                modifier = Modifier
                    .padding(top = 32.dp,start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
                    .height(72.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary
                ),
                shape = MaterialTheme.shapes.medium,
            ) {
                Text(
                    text = stringResource(id = R.string.sign_up),
                    style = MaterialTheme.typography.button,
                    color = MaterialTheme.colors.onPrimary
                )
            }

            Button(
                onClick = onClickLogin,
                modifier = Modifier
                    .padding(top = 8.dp,start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
                    .height(72.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary
                ),
                shape = MaterialTheme.shapes.medium,
            ) {
                Text(
                    text = stringResource(id = R.string.log_in),
                    style = MaterialTheme.typography.button,
                    color = MaterialTheme.colors.onSecondary
                )
            }
        }
    }
}


@Preview
@Composable
fun BackgroundScreenPreview() {
    MyTheme {
        Surface(color = MaterialTheme.colors.background) {
            WelcomeScreen({}, {})
        }

    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun BackgroundScreenPreviewDark() {
    MyTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            WelcomeScreen({}, {})
        }

    }
}