package com.thalessz.ratwitter.retrofit;

import com.thalessz.ratwitter.models.Post;
import com.thalessz.ratwitter.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface ApiService {

    @POST("/login")
    Call<User> login(@Body Map<String, String> credentials);

    @POST("/cadastro")
    Call<Map<String, String>> cadastro(@Body User userDetails);

    @GET("/fetch_posts")
    Call<List<Post>> fetchPosts();

    @POST("/add_post")
    Call<Map<String, String>> addPost(@Body Post postDetails);

    @POST("/like_post/{post_id}")
    Call<Map<String, String>> likePost(@Path("post_id") int postId);
}
