package za.co.transcend.dial365.posts.recyclerviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import za.co.transcend.dial365.R;
import za.co.transcend.dial365.posts.models.Post;

public class PostRecyclerAdapter extends RecyclerView.Adapter<PostViewHolder> {
    ArrayList<Post> postList;
    Context context;

    public PostRecyclerAdapter(ArrayList<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(context).inflate(R.layout.post_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.postId.setText(postList.get(position).getId());
        holder.postTitle.setText(postList.get(position).getTitle());
        holder.postBody.setText(postList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
