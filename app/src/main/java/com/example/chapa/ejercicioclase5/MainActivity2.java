package com.example.chapa.ejercicioclase5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText et;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et=(EditText) findViewById(R.id.txtEnviar);
        btn=(Button) findViewById(R.id.button);
        tv=(TextView) findViewById(R.id.txtRecibido);

        tv.setText(getIntent().getExtras().getString("parametro"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("parametro", et.getText().toString());
                startActivity(intent);

            }
        });
    }
}
