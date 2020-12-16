package com.zksuhf.weight.loadCallBack
import com.kingja.loadsir.callback.Callback
import com.zksuhf.R


//错误布局
class ErrorCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_error
    }
}
