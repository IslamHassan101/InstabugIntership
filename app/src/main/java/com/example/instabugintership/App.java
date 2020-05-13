package com.example.instabugintership;

import android.app.Application;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Instabug.Builder(this, "8bd077395b2b1631ef2e6edb54e7616b")
                .setInvocationEvents(
                        InstabugInvocationEvent.SHAKE,
                        InstabugInvocationEvent.FLOATING_BUTTON)
                .build();
    }
}
