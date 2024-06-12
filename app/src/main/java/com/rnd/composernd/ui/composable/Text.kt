package com.rnd.composernd.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.rnd.composernd.R

@Composable
fun TextExample() {
    SelectionContainer {
        Column(modifier = Modifier.fillMaxSize()) {
//            Text1()
//            Text2()
//            Text3()
//            DisableSelection { Text4() }
//            Text5()
            SuperscriptText("H", "2")
            SubscriptText(normalText = "Hello World", subText = "sub")

        }
    }
}

@Composable
fun Text1() {
    Text(
        "Hello World", modifier = Modifier
            .background(MaterialTheme.colorScheme.secondary)
            .padding(16.dp)
    )
}

@Composable
fun Text2() {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = stringResource(id = R.string.sample_string),
        color = MaterialTheme.colorScheme.primary,
        fontSize = MaterialTheme.typography.bodySmall.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.End
    )
}

@Composable
fun Text3() {
    Text(
        modifier = Modifier.width(200.dp),
        text = buildAnnotatedString {
//            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
//
//            }
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("Hello ")
            }

            append("World")
            append("B")
            append("C")
        }
    )
}

@Composable
fun Text4() {
    Text(text = "Hello World".repeat(40), maxLines = 3, overflow = TextOverflow.Clip)
}

@Composable
fun Text5() {
    Text(text = "Hello World 5")
}

@Composable
fun SuperscriptText(normalText: String, superText: String){
    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(
            fontSize = MaterialTheme.typography.displaySmall.fontSize
        )){
            append(normalText)
        }
        withStyle(style = SpanStyle(
            fontSize = MaterialTheme.typography.displaySmall.fontSize,
            baselineShift = BaselineShift.Superscript

        )){
            append(superText)
        }
    })
}

@Composable
fun SubscriptText(normalText: String, subText: String){
    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(
            fontSize = MaterialTheme.typography.displaySmall.fontSize
        )){
            append(normalText)
        }
        withStyle(style = SpanStyle(
            fontSize = MaterialTheme.typography.displaySmall.fontSize,
            baselineShift = BaselineShift.Subscript
        )){
            append(subText)
        }
    })
}