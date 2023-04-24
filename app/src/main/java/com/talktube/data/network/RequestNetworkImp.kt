package com.talktube.data.network
import com.talktube.data.network.model.YouTubeData
import com.talktube.domain.utils.durationToTime
import com.talktube.domain.utils.urlToString
import java.util.*


class RequestNetworkImp: RequestNetwork  {
    override suspend fun loadData(string: String) {
//        val download = YoutubeDownloader()
//            val request = RequestVideoInfo(urlToString(string))
//        val response = download.getVideoInfo(request)
//        val data = response.data()
//        val details = data.details()
//
//        val date = Date(data.audioFormats()[0].duration())
//        val duration = durationToTime(date.toString())
//
//        return YouTubeData(
//            video_id = details.videoId(),
//            title = details.title(),
//            audio_url = data.audioFormats()[0].url(),
//            author = details.author(),
//            photo = details.thumbnails().get(details.thumbnails().lastIndex),
//            duration = duration
//        )

    }
}
