package com.example.maxim.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID =
            "com.example.maxim.criminalIntent.crime_id";

    public static Intent newIntent(Context packegeContext, UUID crimeId){
        Intent intent = new Intent(packegeContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
    // стр.166 28.09.2017
    // стр.200 02.10.2017

}
