package com.example.usmanali.notificationtestfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        FirebaseMessaging.getInstance().subscribeToTopic("android");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        final FirebaseDatabase database = FirebaseDatabase.getInstance();

        final EditText titleEditText = (EditText) findViewById(R.id.et_title);
        final EditText authorEditText = (EditText) findViewById(R.id.et_author);

        Button submitButton = (Button) findViewById(R.id.btn_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference myRef = database.getReference("Events").push();
                Article article = new Article(titleEditText.getText().toString(),
                        authorEditText.getText().toString());
                myRef.setValue(article);
            }
        });

        Button newpage = (Button) findViewById(R.id.button3);
        newpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, SafeMarker.class);
                startActivity(intent);
            }
        });



    }
}