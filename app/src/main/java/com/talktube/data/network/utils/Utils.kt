package com.talktube.domain.utils

fun urlToString(url: String): String{

    return when(true){
        url.contains("watch?v=", ignoreCase = true) ->  url.substringAfterLast("watch?v=")
        url.contains("youtu.be/", ignoreCase = true) ->  url.substringAfterLast("youtu.be/")
        else -> {""}
    }
}

fun durationToTime(duration: String): String = duration.split("T")[1].split(".")[0]

