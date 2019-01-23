package com.example.lab3_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.map_button_id).setOnClickListener(this);
        findViewById(R.id.call_button_id).setOnClickListener(this);
        findViewById(R.id.go_button_id).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.map_button_id) {
            Uri location = Uri.parse("geo:0,0?q=Kotkantie+1, 90250+Oulu");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
        }
        else if (v.getId() == R.id.call_button_id) {
            Uri number = Uri.parse("tel:+358206110200");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        }
        else if (v.getId() == R.id.go_button_id) {
            String url = ((EditText)findViewById(R.id.text_edit_id)).getText().toString();
            Uri website = Uri.parse(url);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, website);
            startActivity(browserIntent);
        }
    }
}
