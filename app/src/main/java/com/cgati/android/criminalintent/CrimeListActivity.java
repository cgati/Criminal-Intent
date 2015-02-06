package com.cgati.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by cgati on 2/5/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
