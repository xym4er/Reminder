package com.chornyiua.reminder.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chornyiua.reminder.fragment.BirthdayFragment;
import com.chornyiua.reminder.fragment.NoteFragment;
import com.chornyiua.reminder.fragment.ReminderFragment;

/**
 * Created by ChornyiUA on 01.12.2015.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Напоминания",
                "Идеи",
                "Дни рождения"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
            return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ReminderFragment.getInstance();
            case 1:
                return NoteFragment.getInstance();
            case 2:
                return BirthdayFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
