package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

interface MarsRepositoryPhotos {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotoRepository(
    private val marsApiService: MarsApiService
): MarsRepositoryPhotos {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}