package com.example.app_lawyer_firm;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class LoginScreen extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUsername = findViewById(R.id.etUsername);
                EditText etPassword = findViewById(R.id.etPassword);

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                loginUser(username, password);
            }
        });
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (validateInput(username, password)) {
                    // Logic to verify username and password
                } else {
                    Toast.makeText(LoginScreen.this, "Nome de usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateInput(String username, String password) {
        // Implement logic to validate the inputs
        return !username.isEmpty() && !password.isEmpty();
    }
    private void loginUser(String username, String password) {
        // Implemente a verificação de credenciais aqui.

        // Navegue até a tela de sucesso se as credenciais forem válidas.
        if (isValidCredentials(username, password)) {
            Intent intent = new Intent(this, SuccessScreen.class);
            startActivity(intent);
        }
    }

    private boolean isValidCredentials(String username, String password) {
        return false;
    }
}
