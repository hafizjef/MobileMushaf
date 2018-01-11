package com.hafizjef.mobilemushaf.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hafizjef.mobilemushaf.R
import com.hafizjef.mobilemushaf.data.model.Repository
import com.hafizjef.mobilemushaf.databinding.MainFragmentBinding

class MainFragment: Fragment() {

    private lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        val repo = Repository("GitHub", "Ahmad")
        binding.repo = repo
        Handler().postDelayed({repo.repoName = "LOLWUT"}, 2000)
        return binding.root
    }
}