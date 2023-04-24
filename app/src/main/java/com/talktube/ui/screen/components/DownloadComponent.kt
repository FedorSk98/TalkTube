package com.talktube.ui.screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.talktube.R

@Composable
fun DownloadComponent(){
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 8.dp),
        value = "...",
        onValueChange = {},
        trailingIcon =  { Icon(painter = painterResource(R.drawable.baseline_file_download_24), contentDescription = "Проверено", Modifier.clickable {  }) },
        leadingIcon = { Icon(imageVector = Icons.Default.Clear, contentDescription = "emailIcon", Modifier.clickable(){

        })},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Blue,
            unfocusedBorderColor = Blue)
    )
}