package za.co.transcend.dial365.blog.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import za.co.transcend.dial365.R;
import za.co.transcend.dial365.blog.holders.PostHolder;
import za.co.transcend.dial365.blog.models.Post;

public class PostAdapter extends RecyclerView.Adapter<PostHolder> {
    Context mContext;
    List<Post> postList;

    public PostAdapter(Context mContext, List<Post> postList) {
        this.mContext = mContext;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostHolder(LayoutInflater.from(mContext).inflate(R.layout.post_layout, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {
        holder.bodyText.setText(postList.get(position).getBody());
        holder.titleText.setText(postList.get(position).getTitle());
        holder.idText.setText(Integer.toString(postList.get(position).getId()));
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
