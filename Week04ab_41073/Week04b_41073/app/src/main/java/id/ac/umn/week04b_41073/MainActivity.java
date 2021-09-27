package id.ac.umn.week04b_41073;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button main_button_change_1, main_button_change_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_button_change_1 = findViewById(R.id.main_button_change_1);
        main_button_change_2 = findViewById(R.id.main_button_change_2);

        main_button_change_1.setOnClickListener(v -> {
                Intent firstIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(firstIntent);
        });

        main_button_change_2.setOnClickListener(v -> {
                Intent secondIntent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(secondIntent);
        });

    }
}