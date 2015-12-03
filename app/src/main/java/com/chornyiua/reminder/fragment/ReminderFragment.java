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
public class ReminderFragment extends Fragment {
    private static final int FRAGMENT_REMINDER = R.layout.fragment_reminder;
    private View view;

    public static ReminderFragment getInstance(){
        Bundle args = new Bundle();
        ReminderFragment fragment = new ReminderFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_REMINDER, container, false);
        return view;
    }
}
