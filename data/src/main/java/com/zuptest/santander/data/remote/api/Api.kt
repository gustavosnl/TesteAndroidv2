package com.zuptest.data.remote.api

import com.zuptest.data.remote.request.LoginRequest
import com.zuptest.data.remote.response.LoginResponse
import com.zuptest.data.remote.response.StatementsResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Api {

    @POST("login")
    fun doLogin(
        @Body credentials: LoginRequest
    ): Observable<LoginResponse>

    @GET("statements/{idUser}")
    fun listStatementsByUserId(
        @Path("idUser") userId: String
    ): Observable<StatementsResponse>
}