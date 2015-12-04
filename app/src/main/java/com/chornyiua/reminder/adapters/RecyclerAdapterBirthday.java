package com.chornyiua.reminder.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chornyiua.reminder.R;
import com.chornyiua.reminder.objectsToLists.BirthDay;

import java.util.List;

/**
 * Created by ChornyiUA on 04.12.2015.
 */
public class RecyclerAdapterBirthday extends RecyclerView.Adapter<RecyclerAdapterBirthday.ViewHolder> {
    List<BirthDay> birthdayList;

    public RecyclerAdapterBirthday(List<BirthDay> birthdayList) {
        this.birthdayList = birthdayList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvBirthdayName;
        public TextView tvBirthdaySurname;
        public TextView tvBirthdayDescription;
        public TextView tvBirthdayDate;
       // public ImageView ivBirthdayAvatar;

        public ViewHolder(View v) {
            super(v);
            tvBirthdayName = ((TextView) v.findViewById(R.id.birthday_name));
            tvBirthdaySurname = ((TextView) v.findViewById(R.id.birthday_surname));
            tvBirthdayDescription = ((TextView) v.findViewById(R.id.birthday_description));
            tvBirthdayDate = ((TextView) v.findViewById(R.id.birthday_date));
           // ivBirthdayAvatar = ((ImageView) v.findViewById(R.id.birthday_avatar));

        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_birthday, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       // holder.ivBirthdayAvatar.setImageResource(R.drawable.ic_warning_red_900_36dp);
        holder.tvBirthdayName.setText(birthdayList.get(position).getName());
        holder.tvBirthdaySurname.setText(birthdayList.get(position).getSurname());
        holder.tvBirthdayDescription.setText(birthdayList.get(position).getDescription());
        holder.tvBirthdayDate.setText(birthdayList.get(position).getDate()+"");
    }

    @Override
    public int getItemCount() {
        return birthdayList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
