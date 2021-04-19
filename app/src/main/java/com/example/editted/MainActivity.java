package com.example.editted;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=(TextView)this.findViewById(R.id.tv1);
        EditText et1=(EditText)this.findViewById(R.id.et1);
        Button b1=(Button)this.findViewById(R.id.b1);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String str=et1.getText().toString();
               tv1.setText("welcome"+str+"!");
           }
       });
    }
}