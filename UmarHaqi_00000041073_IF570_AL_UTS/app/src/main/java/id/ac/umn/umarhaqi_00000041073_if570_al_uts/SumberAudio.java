package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.LinkedList;

public class SumberAudio implements Serializable {
    private String judul;
    private String keterangan;
    private String audioURI;
    public SumberAudio(String judul, String keterangan, String audioURI){
        this.judul = judul;
        this.keterangan = keterangan;
        this.audioURI = audioURI;
    }

    public String getJudul() { return this.judul; }
    public String getKeterangan(){return this.keterangan;}
    public String getAudioURI(){return this.audioURI;}

    @NonNull
    public String toString(){return this.getJudul() + "=>" + this.getKeterangan();}
}
