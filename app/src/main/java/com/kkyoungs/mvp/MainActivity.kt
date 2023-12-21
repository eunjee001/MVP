package com.kkyoungs.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkyoungs.mvp.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity(), Contract.View {
    private val mBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var presenter: Presenter
    private lateinit var repository: InfoRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

        repository = InfoRepository(this)
        presenter = Presenter(this, repository)

        presenter.initInfo()
        initButtonListener()

    }

    override fun showInfo(info: JSONObject) {
        mBinding.tvFirstName.text = info.getString("first")
        mBinding.tvSecondName.text = info.getString("second")
    }

    private fun initButtonListener(){
        mBinding.btn.setOnClickListener{
            val info = JSONObject()
            info.put("first", mBinding.etFirstName.text.toString())
            info.put("second", mBinding.etSecondName.text.toString())

            mBinding.etFirstName.text.clear()
            mBinding.etSecondName.text.clear()

            presenter.setInfo(info)
            presenter.saveInfo(info)

        }
    }
}