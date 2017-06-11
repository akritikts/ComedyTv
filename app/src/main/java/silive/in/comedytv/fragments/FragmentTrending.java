package silive.in.comedytv.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import silive.in.comedytv.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTrending extends Fragment {


    public FragmentTrending() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_trending, container, false);
    }

}
