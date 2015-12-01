package com.chornyiua.reminder.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chornyiua.reminder.R;

/**
 * Created by ChornyiUA on 01.12.2015.
 */
public class ExampleFragment extends Fragment {
    private static final int EXAMPLE = R.layout.fragment_example;
    private View view;

    public static ExampleFragment getInstance(){
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(EXAMPLE, container, false);
        return view;
    }
}
