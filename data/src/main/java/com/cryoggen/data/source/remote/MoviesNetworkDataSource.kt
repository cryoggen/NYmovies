package com.cryoggen.data.source.remote

import com.cryoggen.data.source.models.remote.NetworkVideoContainer

interface MoviesNetworkDataSource {
    suspend fun getMovies(): NetworkVideoContainer
}