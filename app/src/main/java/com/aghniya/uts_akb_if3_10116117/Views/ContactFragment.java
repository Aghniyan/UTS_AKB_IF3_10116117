package com.aghniya.uts_akb_if3_10116117.Views;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aghniya.uts_akb_if3_10116117.R;

/**
 * A simple {@link Fragment} subclass.
 */

/*=========================================
Tanggal Pembuatan   : 21 Mei 2019
NIM                 : 10116117
Nama                : Aghniya Ni'amillah Nurhilman
Kelas               : AKB-3
 =========================================*/


public class ContactFragment extends Fragment implements View.OnClickListener {

    CardView cvTelp,cvEmail,cvIg,cvFb;
    TextView tvTelp,tvEmail,tvIg,tvFb;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        cvTelp = view.findViewById(R.id.id_telp);
        cvEmail = view.findViewById(R.id.id_email);
        cvFb = view.findViewById(R.id.id_fb);
        cvIg= view.findViewById(R.id.id_ig);
        tvTelp = view.findViewById(R.id.tlp);
        tvEmail = view.findViewById(R.id.email);
        tvFb = view.findViewById(R.id.fb);
        tvIg= view.findViewById(R.id.ig);

        cvTelp.setOnClickListener(this);
        cvEmail.setOnClickListener(this);
        cvFb.setOnClickListener(this);
        cvIg.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.id_telp:
                String telp = tvTelp.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+telp));
                startActivity(intent);
                break;
            case R.id.id_email:
                String email = tvEmail.getText().toString();
                Intent intent2 = new Intent(Intent.ACTION_SENDTO);
                intent2.setData(Uri.parse("mailto:"+email));
                startActivity(intent2);
                break;
            case R.id.id_fb:
                String fb = "https://www.facebook.com/100003638332575";
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse(fb));
                startActivity(intent3);
                break;
            case R.id.id_ig:
                String ig = "https://www.instagram.com/"+tvIg.getText().toString();
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse(ig));
                startActivity(intent4);
                break;
        }
    }
}
