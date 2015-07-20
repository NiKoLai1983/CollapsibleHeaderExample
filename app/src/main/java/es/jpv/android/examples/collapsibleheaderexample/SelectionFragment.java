package es.jpv.android.examples.collapsibleheaderexample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelectionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelectionFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SelectionFragment.
     */
    public static SelectionFragment newInstance() {
        return new SelectionFragment();
    }

    public SelectionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_selection, container, false);
        Button buttonRV = (Button) view.findViewById(R.id.buttonRecyclerView);
        Button buttonParallax = (Button) view.findViewById(R.id.buttonParallax);
        buttonRV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("selectedFragment", FragmentEnum.RECYCLERVIEW.ordinal());
                    mListener.onFragmentInteraction(FragmentEnum.SELECTION, bundle);
                }
            }
        });
        buttonParallax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("selectedFragment", FragmentEnum.PARALLAX.ordinal());
                    mListener.onFragmentInteraction(FragmentEnum.SELECTION, bundle);
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
