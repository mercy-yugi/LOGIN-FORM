package com.yugi.elegance_gym.Api

import com.yugi.elegance_gym.models.LoginRequest
import com.yugi.elegance_gym.models.LoginResponse
import com.yugi.elegance_gym.models.RegisterRequest
import com.yugi.elegance_gym.models.RegisterResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.POST

interface ApiInterface {
    @POST("/register")
    fun register(registerRequest: RegisterRequest): Call<RegisterResponse>
    @POST("/login")
   suspend fun login(loginRequest: LoginRequest): Response<LoginResponse>
}