package tn.medtech.lab3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPicker extends Fragment {
    boolean dateOK = true;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = null;
        if (dateOK) {
            view = inflater.inflate(R.layout.frag_date, container, false);
        } else {
            view = inflater.inflate(R.layout.frag_time, container, false);
        }
        return view;
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        dateOK = args.getBoolean("date");
    }
}
