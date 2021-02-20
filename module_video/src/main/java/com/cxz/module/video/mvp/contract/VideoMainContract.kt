package com.cxz.module.news.mvp.contract

import com.cxz.kotlin.baselibs.mvp.IModel
import com.cxz.kotlin.baselibs.mvp.IPresenter
import com.cxz.kotlin.baselibs.mvp.IView
import com.cxz.kotlin.baselibs.bean.HttpResult
import com.cxz.kotlin.baselibs.bean.LoginData
import io.reactivex.Observable

/**
 * @author chenxz
 * @date 2018/12/25
 * @desc
 */
interface VideoMainContract {

    interface View : IView {
        fun loginSuccess(data: LoginData)

        fun loginFail()
    }

    interface Presenter : IPresenter<View> {
        fun loginWanAndroid(username: String, password: String)

    }

    interface Model : IModel {
        fun loginWanAndroid(username: String, password: String): Observable<HttpResult<LoginData>>

    }

}