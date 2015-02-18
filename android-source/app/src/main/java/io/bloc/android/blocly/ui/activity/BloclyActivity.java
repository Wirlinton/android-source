package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.io.bloc.android.blocly.BloclyApplication;

/**
 * Created by Andre on 16/02/2015.
 */
public class BloclyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
            Toast.makeText(this,
                    BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
                    Toast.LENGTH_LONG).show();
    }

}
