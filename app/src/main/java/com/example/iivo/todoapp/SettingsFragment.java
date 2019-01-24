package com.example.iivo.todoapp;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;
import static android.support.v4.os.LocaleListCompat.create;

public class SettingsFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    //    loadLocale();
        View rootView = inflater.inflate(R.layout.fragment_settings, container, false);



     /*   Button changeLang = getView().findViewById(R.id.changeMyLang);
        changeLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showChangeLanguageDialog();

            }
        });
*/
        return rootView;
    }

   /* private void showChangeLanguageDialog() {
        //array for languages
        final String[] listItems = {"Finnish", "English"};
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(rootView.getContext());
        mBuilder.setTitle("Choose Language...");
        AlertDialog.Builder builder = mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (which == 0) {
                    setLocale("fi-rFI");
                    recreate();
                }
                else if (which == 1){
                    setLocale("en");
                    recreate();
                }
                dialogInterface.dismiss();
            }
        });
    }



    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getContext().getResources().updateConfiguration(config, getContext().getResources().getDisplayMetrics());
        // save data to shared preferences

        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_lang", lang);
        editor.apply();
    }


    public void loadLocale(){
        SharedPreferences prefs = getSharedPreferences("Settings",Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language);
    }*/
}


