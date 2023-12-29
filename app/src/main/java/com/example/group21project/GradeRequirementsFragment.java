package com.example.group21project;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class GradeRequirementsFragment extends Fragment {
    private Button inButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grade_requirements, container, false);

        inButton = view.findViewById(R.id.continuebutton);
        inButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInSwe();
            }
        });

        return view;
    }

    public void openInSwe() {

        Fragment someFragment = new InSweFragment();
        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
