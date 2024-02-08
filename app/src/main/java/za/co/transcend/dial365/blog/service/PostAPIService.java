package za.co.transcend.dial365.blog.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import za.co.transcend.dial365.blog.models.Post;

public interface PostAPIService {
    @GET("posts")
    Call<List<Post>> getPosts();
}
