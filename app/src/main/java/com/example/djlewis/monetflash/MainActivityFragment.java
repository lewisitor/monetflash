package com.example.djlewis.monetflash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener{

    private View rootView;
    private Button buttonCancel; //cancels a digit from current filed when clicked
    private Button buttonBack; //move to next field when clicked
    private FancyButton buttonPay;//sends payment request when pressed
    private EditText phoneNumber;
    private EditText paymentAmount;
    private Button bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bZero; //data entry buttons

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        buttonBack = (Button) rootView.findViewById(R.id.buttonNext);
        buttonCancel = (Button) rootView.findViewById(R.id.buttonCancel);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //save any required persistent data
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        //restore persistent data to the fragment
    }

    @Override
    public void onClick(View v) {
        //wire up buttons with appropriate actions
        
    }
}
