package com.veilsystems.veilaccess.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.veilsystems.veilaccess.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ConnectionStateFragment extends BaseFragment {

    @InjectView(R.id.connectionStateView) TextView mConnectionStateView;
    @InjectView(R.id.connectionQualityView) TextView mConnectionQualityView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_connection_state, null);
        ButterKnife.inject(this, view);
        updateViews();
        return view;
    }

    private void updateViews() {
        String html = "<font color=\"#ffffff\">" + getString(R.string.connected) +
                " + </font><font color=\"#98ba30\">" + getString(R.string.veiled) + "</font>";
        mConnectionStateView.setText(Html.fromHtml(html));

        html = getString(R.string.not_very_good) + " <sub>" + getString(R.string.weak_signal) + "</sub>";
        mConnectionQualityView.setText(Html.fromHtml(html));
    }

}
