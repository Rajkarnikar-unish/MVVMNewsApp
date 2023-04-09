package com.androiddevs.mvvmnewsapp.util

//Sealed class is kind of abstract class but we can mention other class that can inherit this class
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>() : Resource<T>()

}