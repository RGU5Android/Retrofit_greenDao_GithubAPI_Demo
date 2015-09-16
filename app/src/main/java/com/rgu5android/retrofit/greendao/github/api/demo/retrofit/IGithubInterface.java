package com.rgu5android.retrofit.greendao.github.api.demo.retrofit;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by RGU5Android on 16/09/15.
 */
public interface IGithubInterface {
    @GET("/users/{username}")
    public void getFeed(@Path("username") String username, Callback<GithubModel> githubModelCallback);

}
