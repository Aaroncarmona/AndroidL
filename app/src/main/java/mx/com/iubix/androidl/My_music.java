package mx.com.iubix.androidl;


import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import mx.com.iubix.androidl.fragments.Destacados;

public class My_music extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);


        Fragment fr;
        fr = new Destacados();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment1, fr);
        fragmentTransaction.commit();

        /*
        android.app.ActionBar actionbar = getActionBar();
        actionbar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);*/

    }
}
