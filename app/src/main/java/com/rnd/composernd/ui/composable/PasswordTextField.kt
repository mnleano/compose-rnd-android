package com.rnd.composernd.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.rnd.composernd.R

@Composable
fun PasswordTextField() {
    Column(modifier = Modifier.fillMaxSize()) {
        var password by rememberSaveable { mutableStateOf("") }
        var passwordVisibility by remember { mutableStateOf(false)}

        val icon = painterResource(
            if(passwordVisibility) R.drawable.ic_password_visible
            else R.drawable.ic_password_hidden
        )

        val visualTransformation = if(passwordVisibility) PasswordVisualTransformation() else VisualTransformation.None

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") },
            label = { Text("Password") },
            visualTransformation = visualTransformation,
            trailingIcon = {
                IconButton(onClick = {passwordVisibility = !passwordVisibility}) {
                    Icon(painter = icon, contentDescription="Visibility Icon")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
    }
}