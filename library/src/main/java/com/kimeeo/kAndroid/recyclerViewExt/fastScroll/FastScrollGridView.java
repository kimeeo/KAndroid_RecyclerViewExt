package com.kimeeo.kAndroid.recyclerViewExt.fastScroll;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimeeo.kAndroid.listViews.recyclerView.BaseRecyclerViewAdapter;
import com.kimeeo.kAndroid.listViews.recyclerView.DefaultRecyclerViewAdapter;
import com.kimeeo.kAndroid.listViews.recyclerView.verticalViews.GridView;
import com.kimeeo.kAndroid.recyclerViewExt.R;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;

/**
 * Created by bhavinpadhiyar on 1/19/16.
 */
abstract public class FastScrollGridView extends GridView implements FastScrollRecyclerView.SectionedAdapter
{
    public String getSectionName(int position)
    {
        return getSectionLabel(position,getDataProvider().get(position));
    }
    protected String getSectionLabel(int position, Object o){return null;}
    protected BaseRecyclerViewAdapter createListViewAdapter() {
        return new DefaultSectionedAdapter(this.getDataProvider(), this,this);
    }

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
