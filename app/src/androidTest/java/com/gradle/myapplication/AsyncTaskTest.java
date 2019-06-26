package com.gradle.myapplication;

import android.content.Context;



import androidx.core.util.Pair;
import androidx.test.InstrumentationRegistry;


import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class AsyncTaskTest {





    @Test
    public void ServerStringTest() throws InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<Context, String>(InstrumentationRegistry.getTargetContext(), "TEST"));
        Thread.sleep(2000);
        Assert.assertTrue(!endpointsAsyncTask.joke.isEmpty());


    }
}
