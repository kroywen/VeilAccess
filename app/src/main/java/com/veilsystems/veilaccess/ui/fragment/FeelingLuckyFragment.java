package com.veilsystems.veilaccess.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.veilsystems.veilaccess.R;

import butterknife.ButterKnife;

public class FeelingLuckyFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feeling_lucky, null);
        ButterKnife.inject(this, view);
        return view;
    }

}
