package com.example.firma.testapp.RestApi;

import com.example.firma.testapp.Model.ListModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by firman on 20-Mar-18.
 */

public interface ApiInterface {

    @GET("stations/json")
    Call<ListModel> getList ();
}
