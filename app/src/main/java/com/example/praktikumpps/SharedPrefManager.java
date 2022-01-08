package com.example.praktikumpps;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefManager(Context context) {
        sharedPreferences = context.getSharedPreferences("com.example.praktikumpps", context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        setAsDefaultValue();
    }

    private void setAsDefaultValue() {
        setUsername("daffa");
        setPassword("4292");
    }

    public void saveString(String value) {
        editor.putString("sp_string", value);
        editor.commit();
    }

    public void setUsername(String usernameValue) {
        editor.putString("sp_username", usernameValue).apply();
    }

    public void setPassword(String passwordValue) {
        editor.putString("sp_password", passwordValue).apply();
    }

    public void saveIsLogin(Boolean value) {
        editor.putBoolean("sp_islogin", value);
        editor.commit();
    }

    public String getString() {
        return sharedPreferences.getString("sp_string", "");
    }

    public String getUsername() {
        return sharedPreferences.getString("sp_username", "");
    }
    public String getPassword() { return sharedPreferences.getString("sp_password", "");
    }
    public Boolean getIsLogin() {
        return sharedPreferences.getBoolean("sp_islogin", false);
    }
}
