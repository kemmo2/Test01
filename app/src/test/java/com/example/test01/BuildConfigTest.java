package com.example.test01;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildConfigTest {

    @Test
    public void createBCuildConfigClass(){
        BuildConfig buildConfig = new BuildConfig();
        assertNotEquals(null,buildConfig);
    }

}