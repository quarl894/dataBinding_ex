package pl.pszklarska.livedatabinding.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil.setContentView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pl.pszklarska.livedatabinding.R
import pl.pszklarska.livedatabinding.databinding.MainActivityBinding

import pl.pszklarska.livedatabinding.viewmodel.MainViewModel


class MainActivity : BaseActivity<MainActivityBinding>() {

    override val layoutRescourceId: Int get() = R.layout.main_activity
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // databinding start
        binding = setContentView(this, R.layout.main_activity)

        // viewmodel 초기화
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding?.let{
            it.viewModel = viewModel
            it.setLifecycleOwner(this)
        }
    }
}