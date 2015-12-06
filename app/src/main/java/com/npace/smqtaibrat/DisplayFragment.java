package com.npace.smqtaibrat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by npace on 006, 06-Dec-15.
 */
public class DisplayFragment extends Fragment {
    public static DisplayFragment newInstance() {
        return new DisplayFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        return view;
    }
}
