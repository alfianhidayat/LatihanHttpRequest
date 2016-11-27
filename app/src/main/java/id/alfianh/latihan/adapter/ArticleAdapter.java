package id.alfianh.latihan.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import id.alfianh.latihan.R;
import id.alfianh.latihan.models.ArticleResponse;

/**
 * Created by alfianh on 27/11/16.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleHolder> {
    Context context;
    List<ArticleResponse.Datum> data = new ArrayList<>();

    public ArticleAdapter(Context context, List<ArticleResponse.Datum> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public ArticleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_article, parent, false);
        return new ArticleHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleHolder holder, int position) {
        holder.tvTitle.setText(data.get(position).getTitle());
        holder.tvDesc.setText(data.get(position).getExcerpt());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ArticleHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDesc;

        public ArticleHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDesc = (TextView) itemView.findViewById(R.id.tvDesc);
        }
    }
}
