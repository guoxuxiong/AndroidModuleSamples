package com.cxz.kotlin.baselibs.mvp

/**
 *@author: guoxuxiong
 *时间:2021/2/20
 *邮箱:553605867@qq.com
 *描述:
 */
abstract class BasePresenter1<M : IModel, V : IView> : IPresenter<V> {

    protected var mModel: M? = null
    protected var mView: V? = null
    protected val isViewAttend: Boolean
        get() = mView != null

    override fun attachView(mView: V) {
        this.mView = mView
        mModel = createMode()
    }

    abstract fun createMode(): M?

    override fun detachView() {
        TODO("Not yet implemented")
    }

}