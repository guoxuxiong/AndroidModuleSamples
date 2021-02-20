package com.cxz.module.video

import android.annotation.SuppressLint
import android.util.Log
import android.util.LogPrinter
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.cxz.kotlin.baselibs.base.BaseMvpActivity
import com.cxz.kotlin.baselibs.bean.LoginData
import com.cxz.kotlin.baselibs.ext.showToast
import com.cxz.kotlin.baselibs.utils.StatusBarUtil
import com.cxz.module.news.mvp.contract.VideoMainContract
import com.cxz.module.news.mvp.persenter.VideoMainPresenter
import java.util.logging.Logger

@Route(path = "/video/main")
class VideoMainActivity : BaseMvpActivity<VideoMainContract.View, VideoMainContract.Presenter>(), VideoMainContract.View {

    @Autowired
    @JvmField
    var key1: String? = null
    @Autowired
    @JvmField
    var key2: String? = null

    @SuppressLint("ResourceAsColor")
    override fun initView() {
        ARouter.getInstance().inject(this)
        super.initView()
        StatusBarUtil.setColorDiff(this,R.color.colorAccent)
        showToast("key1: $key1, key2: $key2")
        mPresenter?.loginWanAndroid("guoxx","123456")

    }

    override fun start() {
    }

    override fun createPresenter(): VideoMainContract.Presenter = VideoMainPresenter()

    override fun attachLayoutRes(): Int = R.layout.video_activity_video_main
    override fun loginSuccess(data: LoginData) {
        Log.d("LoginData",data.toString())

    }

    override fun loginFail() {
        Log.d("loginFail","loginFail")

    }

//    override fun showError(errorMsg: String) {
//        super.showError(errorMsg)
//        Log.d("errorMsg",errorMsg)
//
//    }
//
//    override fun showDefaultMsg(msg: String) {
//        super.showDefaultMsg(msg)
//        Log.d("msg",msg)
//        showDefaultMsg(msg)
//
//    }

}
