package com.example.app_lawyer_firm;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successid);

        TextView tvSuccess = findViewById(R.id.tvSuccess);
    }
}