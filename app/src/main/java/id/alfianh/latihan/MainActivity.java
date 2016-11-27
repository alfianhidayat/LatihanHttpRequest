package id.alfianh.latihan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import id.alfianh.latihan.manager.SessionManager;
import id.alfianh.latihan.models.ArticleResponse;
import id.alfianh.latihan.models.LoginResponse;
import id.alfianh.latihan.network.FetchArticleTask;
import id.alfianh.latihan.network.LoginTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvHello;
    FetchArticleTask fetchArticleTask;
    LoginTask loginTask;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHello = (TextView) findViewById(R.id.tv_hello);
        dialog = new ProgressDialog(this);
        dialog.setIndeterminate(true);
        dialog.setMessage("Loading...");
        dialog.setCancelable(false);
//        getArticle();
        postData("https://hack.kurio.co.id/v1/auth/login");
//        getArticle();
        tvHello.setOnClickListener(this);
    }

    public void postData(String url) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("email", "alhi.hidayat@gmail.com");
        params.put("password", "semangata");
        params.put("device_token", "mytoken");
        loginTask = new LoginTask(this, url, new LoginTask.MyAsyncTaskInterface() {
            @Override
            public void onShowLoading() {
                dialog.show();
            }

            @Override
            public void onDismissLoading() {
                dialog.dismiss();
            }

            @Override
            public void onSuccess(LoginResponse result) {
                tvHello.setText(result.getName());
                Toast.makeText(MainActivity.this, SessionManager.getInstance(MainActivity.this).getApiKey(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String message) {
                tvHello.setText(message);
            }
        });
        loginTask.execute(params);
    }

    public void getArticle() {
        fetchArticleTask = new FetchArticleTask(this, new FetchArticleTask.MyAsyncTaskInterface() {
            @Override
            public void onShowLoading() {
                dialog.show();
            }

            @Override
            public void onDismissLoading() {
                dialog.dismiss();
            }

            @Override
            public void onSuccess(ArticleResponse result) {
                tvHello.setText(result.getData().get(0).getTitle());
            }

            @Override
            public void onFailed(String message) {
                tvHello.setTag(message);
            }
        });
        fetchArticleTask.execute();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_hello:
                startActivity(new Intent(MainActivity.this, ArticleActivity.class));
                break;
        }
    }
}
