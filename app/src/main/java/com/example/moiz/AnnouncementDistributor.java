package com.example.moiz.hyefa;

/**
 * Created by MOIZ on 11/9/2018.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AnnouncementDistributor extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.distributor_list, container, false);
        return rootView;
    }
}
