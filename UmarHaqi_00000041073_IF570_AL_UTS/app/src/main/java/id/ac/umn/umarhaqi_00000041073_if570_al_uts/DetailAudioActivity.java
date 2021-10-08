package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailAudioActivity extends AppCompatActivity {

    private TextView nama_audio, keterangan_audio;
    private Button play_button;
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_audio);
        nama_audio = (TextView) this.findViewById(R.id.nama_audio);
        keterangan_audio = (TextView) this.findViewById(R.id.keterangan_audio);
        play_button = findViewById(R.id.play_button);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        SumberAudio sound = (SumberAudio) bundle.getSerializable("SoundDetail");
        setTitle(sound.getJudul());
        media = MediaPlayer.create(getApplicationContext(), Uri.parse(sound.getAudioURI()));
        nama_audio.setText(sound.getJudul());
        keterangan_audio.setText(sound.getKeterangan());
        play_button.setOnClickListener(view -> media.start());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}