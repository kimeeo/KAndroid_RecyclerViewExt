package com.kimeeo.kAndroid.recyclerViewExt.fastScroll;

import android.support.annotation.NonNull;

import com.kimeeo.kAndroid.dataProvider.DataProvider;
import com.kimeeo.kAndroid.listViews.recyclerView.DefaultRecyclerViewAdapter;
import com.kimeeo.kAndroid.listViews.recyclerView.IViewProvider;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;

/**
 * Created by BhavinPadhiyar on 23/05/16.
 */
public class DefaultSectionedAdapter extends DefaultRecyclerViewAdapter implements FastScrollRecyclerView.SectionedAdapter {

    private FastScrollRecyclerView.SectionedAdapter sectionNameProvider;

    public DefaultSectionedAdapter(DataProvider dataManager, IViewProvider viewProvider, FastScrollRecyclerView.SectionedAdapter sectionNameProvider) {
        super(dataManager,viewProvider);
        this.sectionNameProvider=sectionNameProvider;
    }

    @NonNull
    @Override
    public String getSectionName(int position) {
        return sectionNameProvider.getSectionName(position);
    }
}
