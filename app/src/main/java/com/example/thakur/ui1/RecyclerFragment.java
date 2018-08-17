package com.example.thakur.ui1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {

RecyclerView recyclerView;
    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        recyclerView=recyclerView.findViewById(R.id.recycler_View);
//        recyclerView= recyclerView.findViewById()
        return inflater.inflate(R.layout.fragment_recycler, container, false);

    }

}
