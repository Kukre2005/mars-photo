package com.example.marsphotos.network

import retrofit2.http.GET

/**
 * A public interface that exposes the [getPhotos] method
 */
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}