package com.aghniya.uts_akb_if3_10116117.Presenters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aghniya.uts_akb_if3_10116117.R;


/*=========================================
Tanggal Pembuatan   : 18 Mei 2019
NIM                 : 10116117
Nama                : Aghniya Ni'amillah Nurhilman
Kelas               : AKB-3
 =====================================  ====*/

public class WalkthroughAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public WalkthroughAdapter(Context context) {
        this.context = context;
    }

    //array
    public int[] data_image = {
            R.drawable.profil_icon,
            R.drawable.kontak_icon,
            R.drawable.friend_icon
    };
    public String[] data_title = {
            "MY PROFILE",
            "MY CONTACT",
            "MY FRIENDS"
    };
    public String[] data_desc = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
    };



    @Override
    public int getCount() {
        return data_image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView wt_image = view.findViewById(R.id.wt_image);
        TextView wt_title = view.findViewById(R.id.wt_title);
        TextView wt_desc = view.findViewById(R.id.wt_desc);

        wt_image.setImageResource(data_image[position]);
        wt_title.setText(data_title[position]);
        wt_desc.setText(data_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
