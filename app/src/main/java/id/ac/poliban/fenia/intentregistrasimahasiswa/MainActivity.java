package id.ac.poliban.fenia.intentregistrasimahasiswa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btShowInput = findViewById(R.id.btShowInput);
        Button btShowData = findViewById(R.id.btShowData);

        btShowData.setOnClickListener(v -> {
            new AlertDialog.Builder( this)
                    .setTitle("info")
                    .setMessage(str)
                    .setPositiveButton("OK", null).show();
        });

        btShowInput.setOnClickListener(v -> {
            startActivityForResult(new Intent(this, mhs.class), 1000);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==1000 && resultCode==RESULT_OK && data.getExtras()!=null) {
            str += data.getStringExtra("nim") + "\n";
            str += data.getStringExtra("nama") + "\n";
            str += data.getStringExtra("alamat") + "\n";
            str += data.getStringExtra("telp");
        }
    }
}
