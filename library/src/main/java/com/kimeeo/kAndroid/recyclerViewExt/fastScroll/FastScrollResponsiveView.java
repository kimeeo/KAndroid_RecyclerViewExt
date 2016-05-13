package com.kimeeo.kAndroid.recyclerViewExt.fastScroll;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimeeo.kAndroid.listViews.recyclerView.verticalViews.ResponsiveView;
import com.kimeeo.kAndroid.recyclerViewExt.R;

/**
 * Created by bhavinpadhiyar on 1/19/16.
 */
abstract public class FastScrollResponsiveView extends ResponsiveView
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
