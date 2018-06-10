package com.indexer.hackernews.ui.hackernewsdash

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.indexer.hackernews.R

class HackerNewDashFragment : Fragment() {

    companion object {
        fun newInstance() = HackerNewDashFragment()
    }

    private lateinit var viewModel: HackerNewsDashViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.hacker_news_dash_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HackerNewsDashViewModel::class.java)

    }

}
