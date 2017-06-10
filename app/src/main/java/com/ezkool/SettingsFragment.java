package com.ezkool;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by rithm on 6/10/2017.
 */

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
