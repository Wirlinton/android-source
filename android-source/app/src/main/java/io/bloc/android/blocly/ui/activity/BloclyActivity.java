package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
<<<<<<< Updated upstream
import android.widget.Toast;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.io.bloc.android.blocly.BloclyApplication;
=======
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.ui.adapter.ItemAdapter;
>>>>>>> Stashed changes

/**
 * Created by Andre on 16/02/2015.
 */
public class BloclyActivity extends Activity {

<<<<<<< Updated upstream
=======

private ItemAdapter itemAdapter;
>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
<<<<<<< Updated upstream
            Toast.makeText(this,
                    BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
                    Toast.LENGTH_LONG).show();
=======
        itemAdapter = new ItemAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_activity_blocly);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);

>>>>>>> Stashed changes
    }

}
