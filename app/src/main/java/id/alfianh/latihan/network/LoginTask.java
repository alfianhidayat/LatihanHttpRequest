package id.alfianh.latihan.network;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.util.HashMap;

import id.alfianh.latihan.manager.SessionManager;
import id.alfianh.latihan.models.LoginResponse;

/**
 * Created by alfianh on 22/11/16.
 */

public class LoginTask extends AsyncTask<HashMap<String, Object>, Void, LoginResponse> {
    Context context;
    String url;
    MyAsyncTaskInterface taskInterface;

    public LoginTask(Context context, String url, MyAsyncTaskInterface myAsyncTaskInterface) {
        this.context = context;
        this.url = url;
        this.taskInterface = myAsyncTaskInterface;
    }

    @Override
    protected LoginResponse doInBackground(HashMap<String, Object>... hashMaps) {
        LoginResponse json = null;
        try {
            json = RestClient.postDataRequest(url, hashMaps[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        this.taskInterface.onShowLoading();
    }

    @Override
    protected void onPostExecute(LoginResponse s) {
        super.onPostExecute(s);
        taskInterface.onDismissLoading();
//        Log.d("Response", s.toString());
        if (s == null) {
            taskInterface.onFailed("Gagal");
        } else {
            Log.i("JSONResult", s.getToken().getAccessToken());
            SessionManager.getInstance(context).setApiKey(s.getToken().getAccessToken());
            taskInterface.onSuccess(s);
        }
    }

    public interface MyAsyncTaskInterface {
        void onShowLoading();

        void onDismissLoading();

        void onSuccess(LoginResponse result);

        void onFailed(String message);
    }

}
