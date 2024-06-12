package com.rnd.composernd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rnd.composernd.ui.composable.ColumnExample
import com.rnd.composernd.ui.composable.LazyColumnExample
import com.rnd.composernd.ui.theme.ComposeRNDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRNDTheme {
                // A surface container using the 'background' color from the theme
//                ColumnExample()
//                RowExample()
//                BoxExample()
//                TextExample()
//                ExpandableCard()
//                TextFieldExample()
//                ImageExample()
//                PasswordTextField()

//                GradientButton(
//                    "THis is BUtton",
//                    Color.White,
//                    Brush.horizontalGradient(colors = listOf(Color.Red, Color.Blue, Color.Green))
//                )
//                {
//
//                }

                LazyColumnExample()
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
    ComposeRNDTheme {
        Greeting("Android")
        ColumnExample()
    }
}