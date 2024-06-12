package com.rnd.composernd.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import com.rnd.composernd.R

/**
 * Note: Read more about Coil Image Library at https://coil-kt.github.io/coil/compose/
 */
@OptIn(ExperimentalCoilApi::class)
@Composable
fun ImageExample(){
    Box(
        modifier = Modifier.width(100.dp).height(100.dp),
        contentAlignment = Alignment.Center
    ){
        val painter = rememberImagePainter(
            data = "https://developer.android.com/images/brand/Android_Robot.png",
            builder = {
                placeholder(R.drawable.ic_launcher_foreground)
                error(R.drawable.ic_launcher_background)
                crossfade(1000)
                transformations(GrayscaleTransformation(),
                CircleCropTransformation()  )
            }
        )
        val painterState = painter.state

        Image(painter = painter, contentDescription="Android Logo")
        if(painterState is ImagePainter.State.Loading){
            CircularProgressIndicator()
        }

    }
}