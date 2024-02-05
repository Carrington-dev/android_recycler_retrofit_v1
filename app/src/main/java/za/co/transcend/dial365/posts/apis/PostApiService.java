package za.co.transcend.dial365.posts.apis;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import za.co.transcend.dial365.posts.models.Post;

public interface PostApiService {
    @GET("users/{user}/repos")
    Call<List<Post>> listRepos(@Path("user") String user);
}
