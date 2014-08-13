package com.doncox.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Don on 8/8/2014.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "3ra58CSCmdKeyzBTBcbM0cyS5qh1HaRK58XeZ42E", "pOEsL1H1Uzh1Ol72q46cm0E2YWGmRnHPeeoms24U");

//        Following three lines used to test Parse
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();


    }
}
