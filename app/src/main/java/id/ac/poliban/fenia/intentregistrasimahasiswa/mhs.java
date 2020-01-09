package id.ac.poliban.fenia.intentregistrasimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class mhs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText etNim, etNama, etAlamat, etTelp;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);

        Button btSend = findViewById(R.id.btSend);

        etNim = findViewById(R.id.etNim);
        etNama = findViewById(R.id.etNama);
        etAlamat = findViewById(R.id.etAlamat);
        etTelp = findViewById(R.id.etTelp);

        btSend.setOnClickListener(v -> {
            send();
        });
    }

    private void send() {
        Intent intent = new Intent(this, mhs.class);
        intent.putExtra("nim", et)
    }
}
