package com.codepath.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UTpN8jyhfqBLwfCg8XMnyrRl02m7Gm1O80Twke4s")
                .clientKey("nCYM7gFDW8z2wmDIqGGDNdQir3B2AseWztW2BFMJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
