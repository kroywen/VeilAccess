package com.veilsystems.veilaccess.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.veilsystems.veilaccess.R;
import com.veilsystems.veilaccess.ui.fragment.ConnectionStateFragment;
import com.veilsystems.veilaccess.ui.fragment.FeelingLuckyFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends Activity {

    @InjectView(R.id.topTextView) TextView mTopTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        getFragmentManager().beginTransaction().add(R.id.connection_state_container,
                new ConnectionStateFragment()).commit();

        getFragmentManager().beginTransaction().add(R.id.feeling_lucky_container,
                new FeelingLuckyFragment()).commit();

        mTopTextView.setSelected(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
