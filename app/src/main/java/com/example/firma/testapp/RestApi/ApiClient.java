package com.example.firma.testapp.RestApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by firman on 20-Mar-18.
 */

public class ApiClient {

    public static ApiInterface initRetrofit(){

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(270, TimeUnit.SECONDS);
        builder.readTimeout(270, TimeUnit.MINUTES);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = builder.build();

        Retrofit retrofitAdapter = new Retrofit.Builder()
                .baseUrl("http://citibikenyc.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface adapter = retrofitAdapter.create(ApiInterface.class);

        return adapter;
    }
}
