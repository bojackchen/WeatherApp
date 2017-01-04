package com.fchen.weatherapp;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreferences {

    SharedPreferences preferences;

    public CityPreferences(Activity activity) {
        preferences = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity() {
        return preferences.getString("city", "Hongkong");
    }

    public void setCity(String city) {
        preferences.edit().putString("city", city).commit();
    }
}
