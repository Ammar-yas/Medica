package com.example.ammar.medica;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DoctorSignUpFragment extends Fragment {

    Spinner titles;
    EditText nameET;
    EditText emailET;
    EditText phoneNumberET;
    EditText passwordET;
    EditText confirmPasswordET;
    Button sigmUpButton;
    TextView signUpTV;

    public DoctorSignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_doctor_sign_up, container, false);
        signUpTV = view.findViewById(R.id.sign_up_TV);
        signUpTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.remove(fm.findFragmentById(R.id.content_view2))
                        .add(R.id.content_view2,new UserSignUpFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        titles = view.findViewById(R.id.titles_spinner);
        ArrayAdapter<CharSequence> titlesList = ArrayAdapter.createFromResource(this.getActivity(),R.array.titles,R.layout.spinner_layout);
        titlesList.setDropDownViewResource(R.layout.single_spinner_item);
        titles.setAdapter(titlesList);

        return view;

    }

}
