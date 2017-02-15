package com.example.opw.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button btnClick = (Button) findViewById(R.id.btnClick);
//        btnClick.setOnClickListener(view -> {
//            final TextView tv = (TextView) findViewById(R.id.tvHello);
//            tv.setText("Nice to meet you");
//        });
        final EditText etName = (EditText) findViewById(R.id.etName);

        final Button btnHello = (Button) findViewById(R.id.btnHello);
        btnHello.setOnClickListener( view -> {
            // TODO: pass txt using intent
            Log.d("Info", "Hello " + etName.getText().toString());
            Intent intent = new Intent(this, ShowMessageActivity.class);
            String msg = etName.getText().toString();
            intent.putExtra("Friend", "Hello " + msg);
            startActivity(intent);
        });



        final Button btnGoodbye = (Button) findViewById(R.id.btnGoodbye);
        btnGoodbye.setOnClickListener( view -> {
            Log.d("Info", "Goodbye " + etName.getText().toString());
            Intent intent = new Intent(this, ShowMessageActivity.class);
            String msg = etName.getText().toString();
            intent.putExtra("Friend", "Bye " + msg);
            startActivity(intent);
        });

    }


}
