package android.example.com.adipurnomo_1202154134_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText user; //Membuat object dari class EdiText
    private EditText pwd; //Membuat object dari class EdiText
    private Button login; //Membuat object dari class Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.username); //Memanggil ID EditText
        pwd = (EditText) findViewById(R.id.password); //Memanggil ID EditText
        login = (Button) findViewById(R.id.loginbtn); //Memanggil ID EditText
    }
    public void onClick(View view) {
        // membuat kondisi apabila user dan password benar
        if (user.getText().toString().equals("EAD")&& pwd.getText().toString().equals("MOBILE") ) {
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
            Intent intentlogin = new Intent(this, DaftarMinuman.class); // pindah ke activity DaftarMinuman
            startActivity(intentlogin);
            // kondisi jika user dan password salah
        } else {
            Toast.makeText(this,"Login Gagal", Toast.LENGTH_SHORT).show(); // muncul toas Login gagal
        }
    }
}

