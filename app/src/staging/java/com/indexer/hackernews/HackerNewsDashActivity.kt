package com.indexer.hackernews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.indexer.hackernews.ui.hackernewsdash.HackerNewsDashFragment

class HackerNewsDashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hacker_news_dash_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, HackerNewsDashFragment.newInstance())
                    .commitNow()
        }
    }

}
