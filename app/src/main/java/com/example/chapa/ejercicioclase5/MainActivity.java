package com.example.chapa.ejercicioclase5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.txtEnviar);
        btn=(Button) findViewById(R.id.button);

        tv=(TextView) findViewById(R.id.txtRecibido);

        //tv.setText(getIntent().getExtras().getString("parametro"));

        Bundle parametros = this.getIntent().getExtras();
        if(parametros !=null){
            String datos = parametros.getString("parametro");
            tv.setText(datos);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("parametro", et.getText().toString());
                startActivity(intent);

            }
        });
    }

}
