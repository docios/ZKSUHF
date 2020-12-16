package com.zksuhf


import android.content.Context
import android.os.Handler

import com.jess.arms.base.BaseApplication
import com.lzy.okhttputils.OkHttpUtils
import com.pgyersdk.crash.PgyCrashManager
import com.tencent.bugly.crashreport.CrashReport


/**
 * 全局Application
 * Created by fzq on 2017/10/24
 */
class MyApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        context = applicationContext
        //必须调用初始化 加载pdf 调用
        OkHttpUtils.init(this)
        //腾讯bugly 上传bug
        CrashReport.initCrashReport(getApplicationContext(), "2db7307863", false)
        //蒲公英
        PgyCrashManager.register(); //推荐使用
    }
    companion object {

        /**
         * 获取全局Application
         *
         * @return
         */
        @get:Synchronized
        var instance: MyApplication? = null
            private set
        /**
         * 获取ApplicationContext
         *
         * @return
         */
        var context: Context? = null
            private set

        var handler: Handler? = null
             set
    }
}
