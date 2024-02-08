package za.co.transcend.dial365.blog.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import za.co.transcend.dial365.R;
import za.co.transcend.dial365.blog.adapters.PostAdapter;
import za.co.transcend.dial365.blog.models.Post;
import za.co.transcend.dial365.blog.service.PostAPIService;

public class PostsActivity extends AppCompatActivity {
    RecyclerView postsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        postsRecyclerView = findViewById(R.id.postsRecyclerView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PostAPIService postAPIService =  retrofit.create(PostAPIService.class);
        Call<List<Post>> call = postAPIService.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(PostsActivity.this, "Some went wrong", Toast.LENGTH_SHORT).show();
                    return;
                }

                List<Post> posts = response.body();
                PostAdapter postAdapter = new PostAdapter(PostsActivity.this, posts);
                postsRecyclerView.setLayoutManager(new LinearLayoutManager(PostsActivity.this));
                postsRecyclerView.setAdapter(postAdapter);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Toast.makeText(PostsActivity.this, "Some went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}