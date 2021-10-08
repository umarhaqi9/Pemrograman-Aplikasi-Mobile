package id.ac.umn.umarhaqi_00000041073_if570_al_uts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.IniViewHolder> {
    private LayoutInflater inflater;
    LinkedList<SumberAudio> daftarAudio;
    private Context mContext;

    RvAdapter(Context context, LinkedList<SumberAudio> daftarAudio){
        this.inflater = LayoutInflater.from(context);
        this.daftarAudio = daftarAudio;
        this.mContext = context;
    }

    @NonNull
    @Override
    public IniViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new IniViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull IniViewHolder holder,
                                 int position) {
        SumberAudio mSumberAudio = daftarAudio.get(position);
        holder.tvRv.setText(mSumberAudio.getJudul());
    }

    @Override
    public int getItemCount() {
        return daftarAudio.size();
    }

    public class IniViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvRv, desc;
        RvAdapter iniAdapter;
        SumberAudio mSumberVideo;
        private int mPosisi;
        Button button_delete;


        public IniViewHolder(@NonNull View itemView, RvAdapter adapter) {
            super(itemView);
            tvRv = itemView.findViewById(R.id.tvRv);
            desc = itemView.findViewById(R.id.keterangan_audio);
            iniAdapter = adapter;
            button_delete = itemView.findViewById(R.id.button_delete);
            button_delete.setOnClickListener(view -> {
                mPosisi = getLayoutPosition();
                daftarAudio.remove(mPosisi);
                notifyItemRemoved(mPosisi);
            });
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mPosisi = getLayoutPosition();
            mSumberVideo = daftarAudio.get(mPosisi);
            Intent detailInten = new Intent(mContext,
                    DetailAudioActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("SoundDetail", mSumberVideo);
            detailInten.putExtras(bundle);
            detailInten.putExtra("extras", mSumberVideo);
            mContext.startActivity(detailInten);
        }
    }
}
