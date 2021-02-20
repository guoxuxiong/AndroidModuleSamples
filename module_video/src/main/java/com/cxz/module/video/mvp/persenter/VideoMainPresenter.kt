package com.cxz.module.news.mvp.persenter

import android.util.Log
import com.cxz.kotlin.baselibs.bean.LoginData
import com.cxz.kotlin.baselibs.ext.ss
import com.cxz.kotlin.baselibs.mvp.BasePresenter
import com.cxz.module.news.mvp.contract.VideoMainContract
import com.cxz.module.news.mvp.model.VideoMainModel

/**
 * @author chenxz
 * @date 2018/12/25
 * @desc
 */
class VideoMainPresenter : BasePresenter<VideoMainContract.Model, VideoMainContract.View>(),
    VideoMainContract.Presenter {

    override fun createModel(): VideoMainContract.Model? = VideoMainModel()
    override fun loginWanAndroid(username: String, password: String) {

        mModel?.loginWanAndroid(username, password)?.ss(mModel, mView) {
            mView?.loginSuccess(it.data)
        }
    }

}


