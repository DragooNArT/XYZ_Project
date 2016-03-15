package com.example.xyzreader.listeners;

import android.support.v4.widget.SwipeRefreshLayout;

import com.example.xyzreader.ui.ArticleListActivity;

/**
 * Created by DragooNART on 3/11/2016.
 */
public class ListRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    ArticleListActivity activity;

    public ListRefreshListener(ArticleListActivity activity) {
        this.activity = activity;
    }


    @Override
    public void onRefresh() {
        activity.refresh();
    }
}
