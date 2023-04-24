package com.talktube.ui.screen.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListAudioComponent(){
    val paddingModifier = Modifier
        .fillMaxSize()
    Card(
        modifier = paddingModifier
    ) {
        LazyColumn(modifier = paddingModifier) {
            items(25) {
                AudioComponent()
            }
        }
    }
}

@Composable
fun AudioComponent(){

    Card(
        elevation = 3.dp,
        modifier = Modifier.fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .height(80.dp),
        shape = RoundedCornerShape(10.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
        ) {


            Image(
                painter = painterResource(com.talktube.R.drawable.baseline_file_download_24),
                contentDescription = "Обложка",
                modifier = Modifier
                    .aspectRatio(1f, matchHeightConstraintsFirst = true)
                    .padding(6.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Column{
                Text(
                    text = "audioItem.title",
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .clickable {
                        },
                )

                Text(
                    text = "audioItem.author",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(top = 4.dp),
                    maxLines = 1
                )
            }

            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier.size(200.dp)
            ){
                IconButton(
                    onClick = {
//                        viewModel.deleteDataBaseItem(audioItem.id, audioItem.title)
                    }
                ){
                    Icon(Icons.Filled.Clear, contentDescription = "Удалить", tint = Color.LightGray)
                }
            }



        }

    }
}