package com.codepath.apps.restclienttemplate.models;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    //list the attributes
    public String name;
    public  long uid;
    public String screenName;
    public String profileImageUrl;

            // deserialize the JSON
    public static  User fromJSON(JSONObject json) throws JsonRpcException, JSONException {
        User user = new User();


        //extract and fill the values

        user.name = json.getString("name");
        user.uid = json.getLong("id");
        user.screenName = json.getString("screenName");
        user.profileImageUrl = json.getString("profile_image_url");

                return user;
    }
}
