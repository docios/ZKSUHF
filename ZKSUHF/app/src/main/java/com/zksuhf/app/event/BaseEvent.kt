package com.zksuhf.app.event

import org.greenrobot.eventbus.EventBus

open class BaseEvent {
    fun post() {
        EventBus.getDefault().post(this)
    }

}
