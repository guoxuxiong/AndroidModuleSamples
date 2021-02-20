package com.cxz.module.video.mvp.api

import com.cxz.kotlin.baselibs.bean.HttpResult
import com.cxz.kotlin.baselibs.bean.LoginData
import io.reactivex.Observable
import retrofit2.http.*

/**
 * Created by chenxz on 2018/4/21.
 */
interface ApiService {

    /**
     * 登录
     * http://www.wanandroid.com/user/login
     * @param username
     * @param password
     */
    @POST("user/login")
    @FormUrlEncoded
    fun loginWanAndroid(@Field("username") username: String,
                        @Field("password") password: String): Observable<HttpResult<LoginData>>
}