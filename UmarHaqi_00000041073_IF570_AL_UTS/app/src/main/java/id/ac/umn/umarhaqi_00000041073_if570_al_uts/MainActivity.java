package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button profile_button, library_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        profile_button = findViewById(R.id.profile_button);
        library_button = findViewById(R.id.library_button);

        profile_button.setOnClickListener(v -> {
            Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(profileIntent);
        });

        library_button.setOnClickListener(v -> {
            Intent libraryIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(libraryIntent);
        });
    }
}