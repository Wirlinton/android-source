package io.bloc.android.blocly.io.bloc.android.blocly;

import android.app.Application;

import io.bloc.android.blocly.io.bloc.android.blocly.io.bloc.android.blocly.api.DataSource;

/**
 * Created by Andre on 18/02/2015.
 */
public class BloclyApplication extends Application {

    public static BloclyApplication getSharedInstance() {
        return sharedInstance;
    }
    public static DataSource getSharedDataSource() {
        return BloclyApplication.getSharedInstance().getDataSource();
    }
    public static BloclyApplication sharedInstance;
    private DataSource dataSource;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();
    }
    public DataSource getDataSource() {
        return dataSource;
    }
   
}
