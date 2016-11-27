package id.alfianh.latihan;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.alfianh.latihan.adapter.ArticleAdapter;
import id.alfianh.latihan.models.ArticleResponse;
import id.alfianh.latihan.network.FetchArticleTask;
import id.alfianh.latihan.network.LoginTask;

/**
 * Created by alfianh on 27/11/16.
 */

public class ArticleActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FetchArticleTask fetchArticleTask;
    ProgressDialog dialog;
    List<ArticleResponse.Datum> data = new ArrayList<>();
    ArticleAdapter articleAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        dialog = new ProgressDialog(this);
        dialog.setIndeterminate(true);
        dialog.setMessage("Loading...");
        dialog.setCancelable(false);
        articleAdapter = new ArticleAdapter(getApplicationContext(), data);
        recyclerView = (RecyclerView) findViewById(R.id.rvContent);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(articleAdapter);
        getArticle();
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
                data.clear();
                data.addAll(result.getData());
                articleAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailed(String message) {
                Toast.makeText(ArticleActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        fetchArticleTask.execute();
    }
}
