package com.hafizjef.mobilemushaf.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hafizjef.mobilemushaf.R
import com.hafizjef.mobilemushaf.databinding.ReportFragmentBinding

class ReportFragment : Fragment() {

    private lateinit var binding: ReportFragmentBinding

    companion object {
        fun newInstance(): ReportFragment {
            return ReportFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.report_fragment, container, false)
        return binding.root
    }
}