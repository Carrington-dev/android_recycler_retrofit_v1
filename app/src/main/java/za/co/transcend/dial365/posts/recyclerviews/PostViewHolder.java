package za.co.transcend.dial365.posts.recyclerviews;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.dial365.R;

public class PostViewHolder extends RecyclerView.ViewHolder {
    TextView postId, postTitle, postBody;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        postId = itemView.findViewById(R.id.post_id);
        postTitle = itemView.findViewById(R.id.post_title);
        postBody = itemView.findViewById(R.id.post_body);
    }
}
