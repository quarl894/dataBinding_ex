package pl.pszklarska.livedatabinding.view

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<T:ViewDataBinding> : AppCompatActivity() {

    lateinit var viewDataBinding: T
    abstract val layoutRescourceId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding = DataBindingUtil.setContentView(this,layoutRescourceId)
    }
}