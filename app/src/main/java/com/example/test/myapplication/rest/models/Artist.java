package com.example.test.myapplication.rest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by test on 26/08/16.
 */

public class Artist {
    @SerializedName("name")
    @Expose
    public String name;

}
