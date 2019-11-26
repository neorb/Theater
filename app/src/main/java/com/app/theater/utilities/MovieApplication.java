package com.app.theater.utilities;

import android.app.Application;

import com.app.theater.R;
import com.app.theater.networking.ConnectivityReceiver;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MovieApplication extends Application {

    private static MovieApplication mInstance;

    public static synchronized MovieApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/ubuntu_regular1.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        mInstance = this;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}