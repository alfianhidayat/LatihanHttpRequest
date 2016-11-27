package id.alfianh.latihan.manager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by alfianh on 27/11/16.
 */

public class SessionManager {
    private Context context;
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    private static SessionManager instance;

    public static SessionManager getInstance(Context context) {
        if (instance == null) instance = new SessionManager(context);
        return instance;
    }

    private SessionManager(Context context) {
        this.context = context;
        sharedPref = context.getSharedPreferences("MySession", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
    }

    public String getApiKey() {
        return sharedPref.getString("token", "");
    }

    public void setApiKey(String value) {
        editor.putString("token", value);
        editor.commit();
    }
}
