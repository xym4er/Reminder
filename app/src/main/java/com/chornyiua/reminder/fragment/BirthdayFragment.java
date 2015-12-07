package com.chornyiua.reminder.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chornyiua.reminder.MainActivity;
import com.chornyiua.reminder.R;
import com.chornyiua.reminder.adapters.RecyclerAdapterBirthday;
import com.chornyiua.reminder.adapters.RecyclerClickListener;
import com.chornyiua.reminder.objectsToLists.BirthDay;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChornyiUA on 01.12.2015.
 */
public class BirthdayFragment extends Fragment {
    private static final int FRAGMENT_BIRTHDAY = R.layout.fragment_birthday;
    private View view;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rvAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;


    public static BirthdayFragment getInstance(){
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_BIRTHDAY, container, false);

        List<BirthDay> birthDayList = getBirthdayList();
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_birthday);
        rvLayoutManager = new LinearLayoutManager(view.getContext());


        recyclerView.setLayoutManager(rvLayoutManager);
        rvAdapter = new RecyclerAdapterBirthday(birthDayList);
        recyclerView.setAdapter(rvAdapter);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(new RecyclerClickListener(getContext()) {
            @Override
            public void onItemClick(RecyclerView recyclerView, View itemView, int position) {
               // TODO: открывается editor


            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

        return view;
    }

    private List<BirthDay> getBirthdayList (){
        List<BirthDay> birthDayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            birthDayList.add(new BirthDay(System.currentTimeMillis(),"Василий Уткин"+i));
        }
        return birthDayList;
    }
}
