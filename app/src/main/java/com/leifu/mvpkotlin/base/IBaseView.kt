package com.leifu.mvpkotlin.base

/**
 *创建人:雷富
 *创建时间:2019/6/5 15:17
 *描述:
 */
interface IBaseView {

    /**
     * 加载中
     */
    fun showLoading()

    /**
     * 取消加载中
     */
    fun dismissLoading()

    /**
     * 显示错误提示
     */
    fun showErrorMsg(msg: String)
}