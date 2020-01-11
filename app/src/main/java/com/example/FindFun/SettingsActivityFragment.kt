package com.example.FindFun

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat


class SettingsActivityFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}