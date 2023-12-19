package com.example.app_lawyer_firm;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class ViewAppointments extends AppCompatActivity {

    private List<String> appointments;

    private TextView tvAppointments;
    private Button btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successid);

        appointments = new ArrayList<>();
        // Fill the list with the scheduled appointments
        appointments.add("Higidio");
        appointments.add("Carlos");

        tvAppointments = findViewById(R.id.tvAppointments_screen);
        btnBack = findViewById(R.id.btnBack);

        tvAppointments.setText(appointments.toString());

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }

        });

    }
}