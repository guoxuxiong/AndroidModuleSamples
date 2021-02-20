package com.cxz.module.news.mvp.model

import com.cxz.kotlin.baselibs.bean.HttpResult
import com.cxz.kotlin.baselibs.bean.LoginData
import com.cxz.kotlin.baselibs.http.RetrofitFactory
import com.cxz.kotlin.baselibs.mvp.BaseModel
import com.cxz.module.news.mvp.contract.VideoMainContract
import com.cxz.module.video.mvp.api.ApiService
import com.cxz.module.video.mvp.http.RetrofitHelper
import io.reactivex.Observable

/**
 * @author chenxz
 * @date 2018/12/25
 * @desc
 */
class VideoMainModel : BaseModel(), VideoMainContract.Model {
    override fun loginWanAndroid(
        username: String,
        password: String
    ): Observable<HttpResult<LoginData>> {

        return RetrofitHelper.service.loginWanAndroid(username, password)
    }
}