package com.example.excoroutine.service

import com.example.excoroutine.model.ShopDetail
import com.example.excoroutine.model.ShopTopModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface PachinkoService {
    @GET("/app/v11/shopTops/news.json")
    suspend fun getShopTop(@Query("prefecture_id") prefectureId: Int): Response<ArrayList<ShopTopModel>>

    @Headers(
        "app_type: 1",
        "dmmptoken: Wbwz0-q3ZPLvw1tApK82yvhmiG9MHuAP"
    )
    @GET("/app/v11/shops/{idShop}")
    suspend fun getShopUrlAsync(@Path("idShop") id: String): Response<ShopDetail>
}