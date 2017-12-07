package com.example.maxim.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by maxim on 10.10.17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment() ;
    }
}
