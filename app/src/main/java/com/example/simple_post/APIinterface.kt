package com.example.simple_post
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
interface APIinterface {

        @GET("/custom-people/")
        fun getname(): Call<ArrayList<People>>

    @POST("/test/")
    fun addUser(@Body userData: People): Call<ArrayList<People>>


    }
class People ( var name: String)


