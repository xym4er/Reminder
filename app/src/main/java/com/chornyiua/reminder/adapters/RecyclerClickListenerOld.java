package com.chornyiua.reminder.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


/**
 * Created by ChornyiUA on 04.12.2015.
 */
public abstract class RecyclerClickListenerOld implements RecyclerView.OnItemTouchListener {

    private GestureDetector gestureDetector;
    private GestureDetector.OnGestureListener gestureListener =
            new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }
            };

    public RecyclerClickListenerOld(Context context) {
        gestureDetector = new GestureDetector(context, gestureListener);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        if (gestureDetector.onTouchEvent(e)) {
            View clickedChild = rv.findChildViewUnder(e.getX(), e.getY());
            if (clickedChild != null && !clickedChild.dispatchTouchEvent(e)) {
                int clickedPosition = rv.getChildPosition(clickedChild);
                if (clickedPosition != RecyclerView.NO_POSITION) {
                    onItemClick(rv, clickedChild, clickedPosition);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
    }

    public abstract void onItemClick(RecyclerView recyclerView, View itemView, int position);


}
