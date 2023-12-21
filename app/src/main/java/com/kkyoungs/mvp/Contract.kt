package com.kkyoungs.mvp

import org.json.JSONObject

interface Contract {
    interface View{
        fun showInfo(info:JSONObject)
    }
    interface Presenter{
        /**
         * 화면 초기화 할때 저장된 데이터가 있는지 Model 에서 확인하고 확인한 결과에 따라 View에 어떤 내용을 보일지 지시
         */
        fun initInfo()

        /**
         * TextView 에 info 데이터를 보여주라고 view에게 지시.
         */
        fun setInfo(info :JSONObject)

        /**
         * EditText 에 입력된 info 데이터를 저장하라고 model 에게 지시.
         */
        fun saveInfo(info : JSONObject)
    }
}