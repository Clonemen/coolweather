package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 27443 on 2018/10/22.
 */

public class AQI {
   public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
