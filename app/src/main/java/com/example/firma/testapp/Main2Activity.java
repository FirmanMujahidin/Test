package com.example.firma.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.firma.testapp.RestApi.ApiClient;
import com.example.firma.testapp.RestApi.ApiInterface;

public class Main2Activity extends AppCompatActivity {

    TextView mName, mValue, mAddress, mTime;
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mName = (TextView) findViewById(R.id.name);
        mValue = (TextView) findViewById(R.id.value);
        mAddress = (TextView) findViewById(R.id.address);
        mTime = (TextView) findViewById(R.id.time);

        apiInterface = ApiClient.initRetrofit();
        SetViewData();
    }

    private void SetViewData() {
        Intent intent = getIntent();
        mName.setText(intent.getStringExtra("name"));
        mValue.setText(intent.getStringExtra("value"));
        mAddress.setText(intent.getStringExtra("address"));
        mTime.setText(intent.getStringExtra("time"));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
