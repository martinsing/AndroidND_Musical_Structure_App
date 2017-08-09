package com.vegetablecorp.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView buy1;
    private TextView buy2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        buy1 = (TextView) findViewById(R.id.buy1);
        buy2 = (TextView) findViewById(R.id.buy2);
        buy1.setOnClickListener(this);
        buy2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buy1:
                payment();
                break;
            case R.id.buy2:
                payment();
                break;
            default:
                break;
        }
    }

    private void payment(){
        Intent intent1 = new Intent(this, PaymentActivity.class);
        startActivity(intent1);
    }
}
