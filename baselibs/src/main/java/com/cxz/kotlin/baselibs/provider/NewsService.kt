package com.cxz.kotlin.baselibs.provider

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * @author chenxz
 * @date 2018/12/22
 * @desc
 */
interface NewsService : IProvider {

    fun getNewsName(): String

}