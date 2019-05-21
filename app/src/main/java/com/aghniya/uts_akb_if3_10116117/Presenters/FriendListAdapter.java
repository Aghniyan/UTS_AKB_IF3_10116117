package com.aghniya.uts_akb_if3_10116117.Presenters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.aghniya.uts_akb_if3_10116117.Models.FriendModel;
import com.aghniya.uts_akb_if3_10116117.R;
import com.aghniya.uts_akb_if3_10116117.Views.FriendFragment;

import java.util.ArrayList;
import java.util.List;

public class FriendListAdapter extends ArrayAdapter<FriendModel> {

    private Context mContext;
    private int mResource;

    private TextView tvNim,tvNama,tvKelas,tvTelp,tvEmail,tvIg;
    public FriendListAdapter(Context context, int resource, ArrayList<FriendModel> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        String nim = getItem(position).getNim();
        String nama = getItem(position).getNama();
        String kelas = getItem(position).getKelas();
        String telp = getItem(position).getTelp();
        String email = getItem(position).getEmail();
        String ig = getItem(position).getIg();

        FriendModel friendModel = new FriendModel(nim,nama,kelas,telp,email,ig);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        tvNim = convertView.findViewById(R.id.ls_nim);
        tvNama= convertView.findViewById(R.id.ls_nama);
        tvKelas= convertView.findViewById(R.id.ls_kelas);
        tvTelp= convertView.findViewById(R.id.ls_telp);
        tvEmail= convertView.findViewById(R.id.ls_email);
        tvIg= convertView.findViewById(R.id.ls_ig);

        tvNim.setText(nim);
        tvNama.setText(nama);
        tvKelas.setText(kelas);
        tvTelp.setText(telp);
        tvEmail.setText(email);
        tvIg.setText(ig);

        return convertView;
    }
}
