package com.kimeeo.kAndroid.recyclerViewExt.stickyRecyclerHeaders;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kimeeo.kAndroid.listViews.recyclerView.stickyRecyclerHeaders.VerticalGrid;

/**
 * Created by bhavinpadhiyar on 1/30/16.
 */
abstract public class HorizontalGrid extends VerticalGrid {
    @Override
    protected RecyclerView.LayoutManager createLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), getColumnsCount(), GridLayoutManager.HORIZONTAL, false);
        return gridLayoutManager;
    }
}
