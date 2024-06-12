package com.rnd.composernd.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun TextFieldExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField1()
    }
}

@Composable
fun TextField1() {

    var text by remember { mutableStateOf("Type here") }

    TextField(
        value = text,
        onValueChange = { text = it },
//        label = { Text("Label") },
//        placeholder = { Text("Placeholder") },
        modifier = Modifier.fillMaxWidth(),
        leadingIcon = {
            IconButton(
                onClick = { /* doSomething() */ }
            ) {
                Icon(Icons.Filled.Email, contentDescription = "Email icon")
            }
        },
        trailingIcon = {
            IconButton(
                onClick = { /* doSomething() */ }
            ) {
                Icon(Icons.Filled.Check, contentDescription = "Check icon")
            }
        },
        keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
                ),
        keyboardActions = KeyboardActions(
                onSearch = {
                    /* Handle search action */
                })
    )
}
