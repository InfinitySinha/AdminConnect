package com.example.admincollege;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView UploadNotice, addGalleryImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UploadNotice = findViewById(R.id.addNotice);

        UploadNotice.setOnClickListener(view -> {
            Toast.makeText(this, "UploadNotice", Toast.LENGTH_SHORT).show();
        });

        addGalleryImage =findViewById(R.id.addGalleryImage);
        UploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.addNotice:
                intent = new Intent(MainActivity.this,UploadNotice.class);
                startActivity(intent);
                break;
            case R.id.addGalleryImage:
                intent = new Intent(MainActivity.this,UploadImage.class);
                startActivity(intent);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}