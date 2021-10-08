package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView referensi1, referensi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("SFX Library and Previewer");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        referensi1 = findViewById(R.id.referensi1);
        referensi2 = findViewById(R.id.referensi2);

        referensi1.setMovementMethod(LinkMovementMethod.getInstance());
        referensi2.setMovementMethod(LinkMovementMethod.getInstance());

    }
}