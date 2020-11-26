package com.example.twoactivities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String extraReply="com.example.android.twoactivities.extra.REPLY";
private EditText mReply;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Intent intent=getIntent();
       String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
       TextView textView=findViewById(R.id.text_message);
       textView.setText(message);
       mReply=findViewById(R.id.editText_second);




    }

    public void returnReply(View view) {
    String reply=mReply.getText().toString();
    Intent replyintent=new Intent();
        replyintent.putExtra(extraReply,reply);
        setResult(RESULT_OK,replyintent);
        finish();
    }
}
