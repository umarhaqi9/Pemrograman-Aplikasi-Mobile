package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button next_button;
    EditText namainput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        getSupportActionBar().setTitle("SFX Library and Previewer");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();

        next_button = findViewById(R.id.next_button);
        namainput = findViewById(R.id.namainput);

        next_button.setOnClickListener(v -> {
            checkText();
        });
    }
    public void checkText(){
        String textName = namainput.getText().toString();
        if(textName.isEmpty()){
            namainput.setError("Tidak boleh kosong");
        }else{
            Intent intentLibrary = new Intent(this, LibraryActivity.class);
            intentLibrary.putExtra("extras", textName);
            startActivity(intentLibrary);
        }
    }
}