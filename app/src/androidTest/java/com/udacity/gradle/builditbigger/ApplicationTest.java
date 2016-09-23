package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import com.example.JokeTeller;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends AndroidTestCase {
    public void testAsyncTask(){
        assertEquals(JokeTeller.getJoke(), new com.udacity.gradle.builditbigger.paid.EndpointsAsyncTask().doInBackground(getContext()));
    }
}