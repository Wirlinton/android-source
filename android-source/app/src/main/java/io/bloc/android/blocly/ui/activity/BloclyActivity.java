package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import io.bloc.android.blocly.BloclyApplication;
import io.bloc.android.blocly.R;

/**
 * Created by Andre on 16/02/2015.
 */
public class BloclyActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
        TextView textElement = (TextView) findViewById(R.id.textViewId);
        textElement.setText("My Favorite Feed");

            Toast.makeText(this,
                    BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
                    Toast.LENGTH_LONG).show();
    }


}
