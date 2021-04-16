package com.example.excoroutine.model

import com.google.gson.annotations.SerializedName

data class ShopTopModel(
    @SerializedName("shop_id")
    var shopId: Int,
    @SerializedName("shop_name")
    var shopName: String? = "",
    @SerializedName("dedama_flag")
    var dedamaFlag: Boolean? = false,
    @SerializedName("shop_img_url")
    var shopImgUrl: String? = null
)

data class ShopDetail(
    @SerializedName("shop_id")
    var shopId: Int,
    @SerializedName("shop_name")
    var shopName: String? = null,
    @SerializedName("dedama_url")
    var dedamaUrl: String? = null
)