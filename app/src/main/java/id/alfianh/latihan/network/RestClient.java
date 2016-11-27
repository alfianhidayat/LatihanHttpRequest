package id.alfianh.latihan.network;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import id.alfianh.latihan.models.ArticleResponse;
import id.alfianh.latihan.models.LoginResponse;

/**
 * Created by alfianh on 22/11/16.
 */

public class RestClient {
    public static ArticleResponse getJSONFromUrl(String paramUrl) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        String jsonResult = null;
        try {
            URL url = new URL(paramUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Kurio-Client-ID", "99");
            connection.setRequestProperty("X-Kurio-Client-Secret", "S3VyaW9IYWNrYXRvbjIw");
            connection.setRequestProperty("X-OS", "android");
            connection.setRequestProperty("X-App-Version", "1");
            connection.setRequestProperty("Accept", "application/json");
//            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Authorization", "Bearer dZ3uljeAfiqq8y2AOsDv4GwjArSgZOWHid8lXDUu");
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            StringBuilder stringBuilder = new StringBuilder();
            if (inputStream == null) {
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }
            if (stringBuilder.length() == 0) {
                return null;
            }
            jsonResult = stringBuilder.toString();
            Gson gson = new GsonBuilder().create();
            ArticleResponse response = gson.fromJson(jsonResult, ArticleResponse.class);
            return response;
        } catch (IOException e) {
            Log.e(FetchArticleTask.class.getSimpleName(), "Error", e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e(FetchArticleTask.class.getSimpleName(), "Error closing stream", e);
                }
            }
        }
        return null;
    }

    public static LoginResponse postDataRequest(String paramUrl, HashMap<String, Object> params) throws Exception {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        String jsonResult = null;
        StringBuilder postData = new StringBuilder();
//        for (HashMap.Entry<String, Object> param : params.entrySet()) {
//            if (postData.length() != 0) postData.append("&");
//            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
//            postData.append("=");
//            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
//        }
        JSONObject object = new JSONObject();
        for (HashMap.Entry<String, Object> param : params.entrySet()) {
            object.put(param.getKey(), param.getValue());
        }
        Log.d("URL encode", postData.toString());
        byte[] postDataBytes = object.toString().getBytes("UTF-8");
        try {
            URL url = new URL(paramUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("X-Kurio-Client-ID", "99");
            connection.setRequestProperty("X-Kurio-Client-Secret", "S3VyaW9IYWNrYXRvbjIw");
            connection.setRequestProperty("X-OS", "android");
            connection.setRequestProperty("X-App-Version", "1");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.getOutputStream().write(postDataBytes);
            connection.connect();

            InputStream inputStream = connection.getInputStream();
            StringBuilder stringBuilder = new StringBuilder();
            if (inputStream == null) {
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }
            if (stringBuilder.length() == 0) {
                return null;
            }
            jsonResult = stringBuilder.toString();
            Gson gson = new GsonBuilder().create();
            LoginResponse response = gson.fromJson(jsonResult, LoginResponse.class);
            return response;
        } catch (IOException e) {
            Log.e(FetchArticleTask.class.getSimpleName(), "Error", e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (final IOException e) {
                    Log.e(FetchArticleTask.class.getSimpleName(), "Error closing stream", e);
                }
            }
        }
        return null;
    }

}
