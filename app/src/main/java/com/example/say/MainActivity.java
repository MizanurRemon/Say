package com.example.say;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    public Button englishButton,banglaButton, exitButton;
    private AlertDialog.Builder alert;
    private VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        englishButton = (Button) findViewById(R.id.homeenglishID);
        banglaButton = (Button) findViewById(R.id.homebanglaID);
        exitButton = (Button) findViewById(R.id.exitbuttonID);

        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, englishActivity.class);
                startActivity(intent);
            }
        });
        /*banglaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlaceholderFragment.class);
                startActivity(intent);
            }
        });*/

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle(R.string.exittext);
                alert.setMessage(R.string.message);
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
            }



        });
    }
}