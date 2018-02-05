package com.example.ammar.medica;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserSignUpFragment extends Fragment {

    EditText nameET;
    EditText emailET;
    EditText phoneNumberET;
    EditText passwordET;
    EditText confirmPasswordET;
    Button sigmUpButton;
    TextView signUpTV;
    SignUpActivity mSignUpActivity;

    public UserSignUpFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user_sign_up, container, false);
        signUpTV = view.findViewById(R.id.sign_up_TV);
        signUpTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.remove(fm.findFragmentById(R.id.content_view))
                        .add(R.id.content_view,new DoctorSignUpFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
        return view;
    }

}
