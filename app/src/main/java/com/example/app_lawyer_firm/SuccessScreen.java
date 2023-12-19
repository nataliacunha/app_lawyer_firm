package com.example.app_lawyer_firm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successid);

        TextView tvSuccess = findViewById(R.id.tvSuccess);
    }
}
