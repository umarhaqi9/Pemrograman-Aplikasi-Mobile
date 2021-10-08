package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.LinkedList;

public class LibraryActivity extends AppCompatActivity {

    RecyclerView iniRv;
    RvAdapter rvAdapter;
    LinkedList<SumberAudio> daftarAudio = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Intent intent = getIntent();
        String name = intent.getStringExtra("extras");
        Toast.makeText(this, "Selamat Datang, " + name, Toast.LENGTH_LONG).show();

        getSupportActionBar().setTitle(name);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        isiDaftarAudio();
        iniRv = (RecyclerView) findViewById(R.id.iniRv);
        rvAdapter = new RvAdapter(this, daftarAudio);
        iniRv.setAdapter(rvAdapter);
        iniRv.setLayoutManager(new LinearLayoutManager(this));

    }

    public void isiDaftarAudio() {

        daftarAudio.add(new SumberAudio("Wind", "Wind sound", "android.resource://" + getPackageName() + "/" + R.raw.wind));
        daftarAudio.add(new SumberAudio("Gun Shot", "Machine Gun", "android.resource://" + getPackageName() + "/" + R.raw.gunshot));
        daftarAudio.add(new SumberAudio("Fart", "Fart Noise", "android.resource://" + getPackageName() + "/" + R.raw.fart));
        daftarAudio.add(new SumberAudio("Scream In Harmony", "ONE OK ROCK - Clock Strikes", "android.resource://" + getPackageName() + "/" + R.raw.scream));
        daftarAudio.add(new SumberAudio("Fire Crackers","Fire","android.resource://"+getPackageName() + "/"+ R.raw.fire));
        daftarAudio.add(new SumberAudio("Crow","Crow Howl","android.resource://"+getPackageName() + "/"+ R.raw.crow));
        daftarAudio.add(new SumberAudio("Dial","Phone Dial","android.resource://"+getPackageName() + "/"+ R.raw.dial));
        daftarAudio.add(new SumberAudio("Laughs","Baby Laughs","android.resource://"+getPackageName() + "/"+ R.raw.laugh));
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent profileIntent = new Intent(LibraryActivity.this,ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.home:
                Intent homeIntent = new Intent(LibraryActivity.this,MainActivity.class);
                startActivity(homeIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}