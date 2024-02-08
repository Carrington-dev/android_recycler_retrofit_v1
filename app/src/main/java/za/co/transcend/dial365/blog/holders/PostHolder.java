package za.co.transcend.dial365.blog.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.dial365.R;

public class PostHolder extends RecyclerView.ViewHolder {
    public TextView idText, titleText, bodyText;
    public PostHolder(@NonNull View itemView) {
        super(itemView);

        idText = itemView.findViewById(R.id.post_id);
        titleText = itemView.findViewById(R.id.post_title);
        bodyText = itemView.findViewById(R.id.post_body);
    }
}
