package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext;
    public static final String HELLO_text="com.example.multiscreen.extra_hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View view){
        //Toast.makeText(MainActivity.this, "Helllo", Toast.LENGTH_SHORT).show();
        Log.d("btton","No error");
        edittext=findViewById(R.id.editText);
        String name=edittext.getText().toString();
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra(HELLO_text,name);
        startActivity(intent);



    }
}