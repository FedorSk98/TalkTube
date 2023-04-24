package com.talktube.data.network

import com.talktube.data.network.model.YouTubeData


interface RequestNetwork {
    suspend fun loadData(string: String)
}