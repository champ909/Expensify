package com.expensetracker.Dbutils;

import android.content.Context;
import android.content.SharedPreferences;

import com.expensetracker.Constants;
import com.expensetracker.Interfaces.AsyncResponse;
import com.expensetracker.Model.AsyncData;
import com.expensetracker.NetworkUtils;
import com.google.firebase.iid.FirebaseInstanceId;

import org.json.JSONObject;

import java.net.URL;

/**
 * Created by user on 08-07-2017.
 */

public class UserInfo {

Context context;

    public UserInfo(Context context) {
this.context = context;
    }

    public void get_users(String username, String password, AsyncResponse asyncResponse) {

        NetworkUtils networkUtils = new NetworkUtils(asyncResponse);
        String stringurl = Constants.GET_USER;
        URL url = null;
        JSONObject jsonObject = null;
        try {
            url = new URL(stringurl);
            jsonObject = new JSONObject();
            jsonObject.put("username", username);
            jsonObject.put("password", password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AsyncData asyncTaskdata = new AsyncData(url, jsonObject);
        networkUtils.execute(asyncTaskdata);

    }

    public void insert_user(String username, String password, String email, AsyncResponse asyncResponse) {

        NetworkUtils networkUtils = new NetworkUtils(asyncResponse);
        String stringurl = Constants.REGISTER_USER;
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        URL url = null;
        JSONObject jsonObject = null;
        try {
            url = new URL(stringurl);
            jsonObject = new JSONObject();
            jsonObject.put("username", username);
            jsonObject.put("password", password);
            jsonObject.put("email", email);
            jsonObject.put("registration_token", refreshedToken);

        } catch (Exception e) {
            e.printStackTrace();
        }
        AsyncData asyncTaskdata = new AsyncData(url, jsonObject);
        networkUtils.execute(asyncTaskdata);
    }


    public void delete_user(int id, AsyncResponse asyncResponse) {

        NetworkUtils networkUtils = new NetworkUtils(asyncResponse);
        String stringurl = Constants.DELETE_USER;
        URL url = null;
        JSONObject jsonObject = null;
        try {
            url = new URL(stringurl);
            jsonObject = new JSONObject();
            jsonObject.put("id", id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        AsyncData asyncTaskdata = new AsyncData(url, jsonObject);
        networkUtils.execute(asyncTaskdata);
    }


    public void edit_user(int id, String password, String email, AsyncResponse asyncResponse) {

        NetworkUtils networkUtils = new NetworkUtils(asyncResponse);

        String stringurl = Constants.EDIT_USER;

        URL url = null;
        JSONObject jsonObject = null;
        try {
            url = new URL(stringurl);
            jsonObject = new JSONObject();
            jsonObject.put("id", id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        AsyncData asyncTaskdata = new AsyncData(url, jsonObject);
        networkUtils.execute(asyncTaskdata);
    }

    public void reg_new_token(int userid,String token,AsyncResponse asyncResponse){

        NetworkUtils networkUtils = new NetworkUtils(asyncResponse);

        String stringurl = Constants.UPDATE_TOKEN;



        URL url = null;
        JSONObject jsonObject = null;
        try {
            url = new URL(stringurl);
            jsonObject = new JSONObject();
            jsonObject.put("reg_token", token);
            jsonObject.put("userid", userid);

        } catch (Exception e) {
            e.printStackTrace();
        }
        AsyncData asyncTaskdata = new AsyncData(url, jsonObject);
        networkUtils.execute(asyncTaskdata);

    }


}