package com.kimeeo.kAndroid.recyclerViewExt.fastScroll;

import android.support.annotation.LayoutRes;

import com.kimeeo.kAndroid.listViews.recyclerView.verticalViews.StaggeredGridView;
import com.kimeeo.kAndroid.recyclerViewExt.R;

/**
 * Created by bhavinpadhiyar on 1/19/16.
 */
abstract public class FastScrollStaggeredGridView extends StaggeredGridView
{
    @Override
    @LayoutRes
    protected int getRootRefreshLayoutResID() {
        return R.layout._fragment_recycler_fast_scroll_with_swipe_refresh_layout;
    }
    @Override
    @LayoutRes
    protected int getRootLayoutResID() {
        return R.layout._fragment_recycler_fast_scroll;
    }
}
