package com.example.work2;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest{

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.work2", appContext.getPackageName());
    }

}