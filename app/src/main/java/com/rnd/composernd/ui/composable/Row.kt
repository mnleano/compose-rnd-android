package com.rnd.composernd.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RowExample(){
    Row (modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically){
        CustomItem(width = 50.dp, weight = 1f, text = "Item 1")
        CustomItem(width = 75.dp, weight = 2f, color = Color.Red, text = "Item 2")
        CustomItem(width = 100.dp, weight = 3f, color = Color.Blue, text = "Item 3")
        CustomItem(width = 125.dp, weight = 4f, color = Color.Green, text = "Item 4")
    }
}


@Composable
fun RowScope.CustomItem(
    width: Dp,
    weight: Float = 1f,
    color: Color = MaterialTheme.colorScheme.primary,
    text: String
) {
    Surface(
        modifier = Modifier
            .width(width)
            .weight(weight),
        color = color
    ) {
        Text(text)
    }
}