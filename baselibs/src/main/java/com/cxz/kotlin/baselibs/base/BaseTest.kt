package com.cxz.kotlin.baselibs.base

import com.cxz.kotlin.baselibs.mvp.IPresenter
import com.cxz.kotlin.baselibs.mvp.IView

/**
 *@author: guoxuxiong
 *时间:2021/2/20
 *邮箱:553605867@qq.com
 *描述:
 */
abstract  class BaseTest<in V:IView,P:IPresenter<V>>:BaseActivity(),IView{
    private var mPresenter: P? =null
    protected  abstract  fun createPrenster():P
    override fun initView() {
        mPresenter=createPrenster()
        mPresenter?.attachView(this as V)

    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
        mPresenter=null
    }
}