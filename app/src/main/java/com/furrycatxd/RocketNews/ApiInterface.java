package com.furrycatxd.RocketNews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("top-headlines")
    Call<News> getNews(
             @Query("country") String country,
             @Query("apiKey") String apiKey);

    @GET("everything")
    Call<News> getEverything(
            @Query("q") String topic,
            @Query("apiKey") String apiKey);

}
