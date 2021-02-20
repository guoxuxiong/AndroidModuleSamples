package com.cxz.module.video.mvp.http

import com.cxz.kotlin.baselibs.http.RetrofitFactory
import com.cxz.module.video.mvp.api.ApiService
import com.cxz.wanandroid.constant.Constant

/**
 *@author: guoxuxiong
 *时间:2021/2/19
 *邮箱:553605867@qq.com
 *描述:
 */
object RetrofitHelper: RetrofitFactory<ApiService>() {
    override
    fun baseUrl(): String {
        return  Constant.BASE_URL
    }

    override
    fun getService(): Class<ApiService> {
        return ApiService::class.java
    }
}