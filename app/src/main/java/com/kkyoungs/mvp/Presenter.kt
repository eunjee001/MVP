package com.kkyoungs.mvp

import org.json.JSONObject

class Presenter(val view : Contract.View, val repository: InfoRepository) : Contract.Presenter {
    override fun initInfo() {
        repository.getInfo(object : InfoDataSource.LoadInfoCallback{
            override fun onInfoLoaded(info: JSONObject) {
                view.showInfo(info)
            }

            override fun onDataNotAvailable() {
                // 아무것도 안함
            }

        })
    }

    override fun setInfo(info: JSONObject) {
        view.showInfo(info)
    }

    override fun saveInfo(info: JSONObject) {
        repository.saveInfo(info)
    }

}