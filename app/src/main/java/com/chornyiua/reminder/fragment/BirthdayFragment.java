package com.chornyiua.reminder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.util.*;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chornyiua.reminder.EditorActivity;
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

        getBirthdayList();
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_birthday);
        rvLayoutManager = new LinearLayoutManager(view.getContext());


        recyclerView.setLayoutManager(rvLayoutManager);
        rvAdapter = new RecyclerAdapterBirthday(BirthDay.BIRTHDAYS);
        recyclerView.setAdapter(rvAdapter);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.addOnItemTouchListener(
                new RecyclerClickListener(getActivity().getApplicationContext(), new RecyclerClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getActivity().getApplicationContext(), EditorActivity.class);
                        intent.putExtra(EditorActivity.ID, BirthDay.BIRTHDAYS.get(position).getId());

                        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                                // the context of the activity
                                getActivity(),

                                // For each shared element, add to this method a new Pair item,
                                // which contains the reference of the view we are transitioning *from*,
                                // and the value of the transitionName attribute
                                new Pair<View, String>(view.findViewById(R.id.birthday_avatar),
                                        getString(R.string.transition_name_circle)),
                                new Pair<View, String>(view.findViewById(R.id.birthday_name),
                                        getString(R.string.transition_name_name)),
                                new Pair<View, String>(view.findViewById(R.id.birthday_date),
                                        getString(R.string.transition_name_date))
                        );
                        ActivityCompat.startActivity(getActivity(), intent, options.toBundle());
                    }
                }));



        return view;
    }

    private void getBirthdayList (){

        for (int i = 0; i < 20; i++) {
            BirthDay.BIRTHDAYS.add(new BirthDay(System.currentTimeMillis(),"Василий Уткин"+i));
        }

    }
}
