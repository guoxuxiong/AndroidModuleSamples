package com.cxz.kotlin.baselibs.bean

import com.squareup.moshi.Json

/**
 *@author: guoxuxiong
 *时间:2021/2/19
 *邮箱:553605867@qq.com
 *描述:
 */

data class HttpResult<T>(@Json(name="data") val  data:T):BaseBean()

// 登录数据
data class LoginData(
    @Json(name = "chapterTops") val chapterTops: MutableList<String>,
    @Json(name = "collectIds") val collectIds: MutableList<String>,
    @Json(name = "email") val email: String,
    @Json(name = "icon") val icon: String,
    @Json(name = "id") val id: Int,
    @Json(name = "password") val password: String,
    @Json(name = "token") val token: String,
    @Json(name = "type") val type: Int,
    @Json(name = "username") val username: String
)