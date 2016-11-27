package id.alfianh.latihan.network;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import id.alfianh.latihan.models.ArticleResponse;

/**
 * Created by alfianh on 22/11/16.
 */

public class FetchArticleTask extends AsyncTask<Void, Void, ArticleResponse> {
    Context context;
    ProgressDialog dialog;
    MyAsyncTaskInterface taskInterface;

    public FetchArticleTask(Context context, MyAsyncTaskInterface myAsyncTaskInterface) {
        this.context = context;
        this.taskInterface = myAsyncTaskInterface;
    }

    @Override
    protected ArticleResponse doInBackground(Void... voids) {
        ArticleResponse json = RestClient.getJSONFromUrl("https://hack.kurio.co.id/v1/feed/topic:40?detail=true");
        return json;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        this.taskInterface.onShowLoading();
    }

    @Override
    protected void onPostExecute(ArticleResponse s) {
        super.onPostExecute(s);
        Log.i("JSONResult", s.toString());
        taskInterface.onDismissLoading();
        if (s == null) {
            taskInterface.onFailed("Data tidak ada !");
        } else {
            taskInterface.onSuccess(s);
        }
    }

    public interface MyAsyncTaskInterface {
        void onShowLoading();

        void onDismissLoading();

        void onSuccess(ArticleResponse result);

        void onFailed(String message);
    }

}
