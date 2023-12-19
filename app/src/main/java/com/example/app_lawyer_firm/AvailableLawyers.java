package com.example.app_lawyer_firm;
import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        import java.util.ArrayList;
        import java.util.List;
public class AvailableLawyers extends AppCompatActivity {
    private List<String> lawyers;
    private TextView tvLawyers;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_lawyers);

        lawyers = new ArrayList<>();
        // Fill the list with the names of available lawyers
        lawyers.add("Higidio");
        lawyers.add("Carlos");

        tvLawyers = findViewById(R.id.tvLawyers);
        btnBack = findViewById(R.id.btnBack);

        tvLawyers.setText(lawyers.toString());

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}