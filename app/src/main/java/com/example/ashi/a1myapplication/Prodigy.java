package com.example.ashi.a1myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.concurrent.ExecutionException;

public class Prodigy extends Fragment {

String[] event_name;
String[] posters;
String waste;

    private OnFragmentInteractionListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_prodigy,container,false);
        if (mListener != null) {
            mListener.onFragmentInteraction("Prodigy 18");
        }
//        MyAsync async=new MyAsync(getContext());
//        async.execute("http://upesacm.org/ACM_App/poster.php");
//        try{
//            waste=async.get();
//            posters=waste.split("#111#");
//
//        }catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        MyAsync async1=new MyAsync(getContext());
//        async1.execute("http://upsacm.org/ACM_app/Event_name.php");
//        try {
//            waste=async1.get();
//            event_name=waste.split("#111#");
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        GridView grid= view.findViewById(R.id.grid);
       // CustomAdapter custom=new CustomAdapter(getContext(),event_name,posters);
        return view;
    }


    // TODO: Rename method, update argument and hook method into UI event
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String title);
    }
}
