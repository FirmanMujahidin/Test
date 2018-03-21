package com.example.firma.testapp;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.firma.testapp.Adapter.AdapterItem;
import com.example.firma.testapp.Model.ListModel;
import com.example.firma.testapp.RestApi.ApiClient;
import com.example.firma.testapp.RestApi.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btnRequest;

    ApiInterface apiInterface;
    AdapterItem adapterItem;
    RecyclerView.LayoutManager layoutManager;
    LinearLayout linlaHeaderProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.list_item);
        btnRequest = (Button) findViewById(R.id.request);
        linlaHeaderProgress = (LinearLayout) findViewById(R.id.linlaHeaderProgress);

        apiInterface = ApiClient.initRetrofit();
        GetListData();
        GetRequest();
    }

    public void GetRequest(){
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetListData();
                new Task().execute();
            }
        });
    }




    public void GetListData(){
        final Call<ListModel> getData = apiInterface.getList();
        getData.enqueue(new Callback<ListModel>() {
            @Override
            public void onResponse(Call<ListModel> call, Response<ListModel> response) {

                List<ListModel.StationBeanList> lists = response.body().getStationBeanList();

                if (response.isSuccessful()){
                    adapterItem = new AdapterItem(lists,getApplicationContext());
                    layoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapterItem);

                    Log.d("TAG", "onResponse Berhasil: " + response.body().getStationBeanList());
                }
            }

            @Override
            public void onFailure(Call<ListModel> call, Throwable t) {
                Log.d("TAG", "onFailure gagal: " + t);

                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        });
    }

    @SuppressLint("NewApi")
    class Task extends AsyncTask<String, Integer, Boolean> {
        @Override
        protected Boolean doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onPreExecute() {
            linlaHeaderProgress.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Boolean result) {
            linlaHeaderProgress.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
            adapterItem.notifyDataSetChanged();
            super.onPostExecute(result);
        }

    }
}
