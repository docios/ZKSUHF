package com.zksuhf.weight.loadCallBack

import com.kingja.loadsir.callback.Callback
import com.zksuhf.R

/**
 * 空布局
 */

class EmptyCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_empty
    }

}
