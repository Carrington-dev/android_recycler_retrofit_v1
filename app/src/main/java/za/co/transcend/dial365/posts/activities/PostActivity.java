package za.co.transcend.dial365.posts.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import za.co.transcend.dial365.R;
import za.co.transcend.dial365.posts.apis.PostApiService;
import za.co.transcend.dial365.posts.models.Post;
import za.co.transcend.dial365.posts.recyclerviews.PostRecyclerAdapter;

public class PostActivity extends AppCompatActivity {
    RecyclerView postRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        postRecyclerView = findViewById(R.id.recyclerViewPosts);
        ArrayList<Post> postList = new ArrayList<>(Arrays.asList(
                new Post(1, 1, "I am here", "I am the body of this useless code change me now"),
                new Post(2, 1, "I am here", "I am the body of this useless code change me now"),
                new Post(3, 1, "I am here", "I am the body of this useless code change me now"),
                new Post(4, 1, "I am here", "I am the body of this useless code change me now"),
                new Post(5, 1, "I am here", "I am the body of this useless code change me now"),
                new Post(6, 1, "I am here", "I am the body of this useless code change me now")
        ));

        System.out.println(postList.size());

        PostRecyclerAdapter postRecyclerAdapter = new PostRecyclerAdapter(postList, this);
        postRecyclerView.setAdapter(postRecyclerAdapter);


//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com/posts")
//                .build();
//
//        PostApiService service = retrofit.create(PostApiService.class);
//        Call<List<Post>> repos = service.listRepos("1");
//
//        System.out.println(repos);



//        PostRecyclerAdapter postRecyclerAdapter = new PostRecyclerAdapter((ArrayList<Post>) repos, this);
//        postRecyclerView.setAdapter(postRecyclerAdapter);

    }
}