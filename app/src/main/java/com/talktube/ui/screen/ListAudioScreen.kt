package com.talktube.ui.screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.talktube.ui.screen.components.AudioPlayerComponent
import com.talktube.ui.screen.components.DownloadComponent
import com.talktube.ui.screen.components.ListAudioComponent

@Composable
fun ListAudioScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DownloadComponent()
        ListAudioComponent()
        AudioPlayerComponent()
    }
}