package com.example.ton2xmania.hitungluas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_panjang, et_lebar;
    TextView tv_hasil;
    Button bHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hasil = (TextView) findViewById(R.id.nilai_hasil);
        et_panjang = (EditText) findViewById(R.id.et_panjang);
        et_lebar = (EditText) findViewById(R.id.et_lebar);
        bHitung = (Button) findViewById(R.id.bHitung);
        bHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_panjang.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Harap mengisi panjang", Toast.LENGTH_SHORT).show();
                } else if (et_lebar.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Harap mengisi lebar", Toast.LENGTH_SHORT).show();
                } else {
                    hitung(Double.valueOf(et_panjang.getText().toString()), Double.valueOf(et_lebar.getText().toString()));
                }
            }
        });
    }

    private void hitung(Double panjang, Double lebar) {
        Double luas = panjang * lebar;
        tv_hasil.setText("" + luas);
    }
}
