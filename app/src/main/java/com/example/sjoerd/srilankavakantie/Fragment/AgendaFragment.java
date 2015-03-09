package com.example.sjoerd.srilankavakantie.Fragment;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sjoerd.srilankavakantie.Adapters.CustomCursorAdapter;
import com.example.sjoerd.srilankavakantie.R;

/**
 * Created by Sjoerd on 7-3-2015.
 */
public class AgendaFragment extends Fragment implements AdapterView.OnItemClickListener {

    // Abstract methods
    OnProfileSelectedListener mSelectedProfileListener;

    // Fields
    private CustomCursorAdapter mCustomAdapter;
    private Cursor mCursor;
    private ListView mList;

    // Interfaces
    public interface OnProfileSelectedListener {
        public void OnProfileSelected(int position, int gymnastId);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mSelectedProfileListener = (OnProfileSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnArticleSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_agenda, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize the cursor

        // Set the list
        mList = (ListView) getActivity().findViewById(R.id.listview);
        mList.setAdapter(mCustomAdapter);
        mList.setOnItemClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
