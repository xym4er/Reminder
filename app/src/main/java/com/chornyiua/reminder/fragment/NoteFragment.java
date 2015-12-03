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
public class NoteFragment extends Fragment {
    private static final int FRAGMENT_NOTE = R.layout.fragment_note;
    private View view;

    public static NoteFragment getInstance(){
        Bundle args = new Bundle();
        NoteFragment fragment = new NoteFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_NOTE, container, false);
        return view;
    }
}
