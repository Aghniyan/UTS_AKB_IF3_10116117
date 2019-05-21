package com.aghniya.uts_akb_if3_10116117.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aghniya.uts_akb_if3_10116117.Models.FriendModel;
import com.aghniya.uts_akb_if3_10116117.Presenters.FriendListAdapter;
import com.aghniya.uts_akb_if3_10116117.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

/*=========================================
Tanggal Pembuatan   : 21 Mei 2019
NIM                 : 10116117
Nama                : Aghniya Ni'amillah Nurhilman
Kelas               : AKB-3
 =========================================*/

public class FriendFragment extends Fragment {

    FriendModel friendModel;

    ListView listView;
    View view;

    private String[] dataNim = {
            "10116072",
            "10116252",
            "10116261",
            "10317010",
            "10116251",
            "10116236",
            "10116267",
            "10116006"
    };
    private String[] dataNama= {
            "Zhafirah Sakinah B",
            "Helsan Firmansyah",
            "Yusri Syahrul",
            "R. Roror Widiasih",
            "M. Rasyid Ridha",
            "Anisa Dewi U.K.",
            "Yuka Pangestu",
            "Ala Rai A."
    };
    private String[] dataKelas= {
            "IF-2",
            "IF-6",
            "IF-6",
            "TI-1",
            "IF-6",
            "IF-6",
            "IF-6",
            "IF-14K"
    };
    private String[] dataTelp= {
            "082320667302",
            "08119071111",
            "081528865801",
            "081324499886",
            "089695822463",
            "089683819488",
            "082281880549",
            "082120651882"
    };
    private String[] dataIg= {
            "@zhafirah_sakinah",
            "@helsanfirmansyahh",
            "@yusrisahrul",
            "@widiasih_kemala",
            "@rasyidridha539",
            "@ansdwuk",
            "-",
            "@rai_dillah",

    };
    private String[] dataEmail= {
            "zhafirah.sb28@gmail.com",
            "helsanfirmansyah@gmail.com",
            "yusri10sahrul@gmail.com",
            "widiasihkemala@gmail.com",
            " mrasyidridha532@gmail.com",
            "anisa.dewi2014@gmail.com",
            "yukazalpino@gmail.com",
            "spensa2010alarai@gmail.com"
    };

    public FriendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_friend, container, false);

        listView = view.findViewById(R.id.list_view);
        initData();
        ArrayList<FriendModel> friendList = new ArrayList<>();
        friendList.add(friendModel);
        FriendListAdapter adapter = new FriendListAdapter(this, R.layout.list_friend,friendList);
        listView.setAdapter(adapter);
        return view;


    }

    private void initData() {
        for (int i=0; i<dataNim.length;i++){
            friendModel = new FriendModel(dataNim[i],dataNama[i],dataKelas[i],dataTelp[i],dataEmail[i],dataIg[i]);
        }


    }

}
