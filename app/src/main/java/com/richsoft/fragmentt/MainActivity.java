package com.richsoft.fragmentt;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements FragmentOne.OnClickListener {
    private FragmentOne mFragmentOne;
    private FragmentTwo mFragmentTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(FragmentOne.TAG, "MainActivityonCreate: ");

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            mFragmentOne = new FragmentOne();
            ft.add(R.id.fl, mFragmentOne, "one");
            ft.commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(FragmentOne.TAG, "MainActivityonStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(FragmentOne.TAG, "MainActivityonResume: ");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(FragmentOne.TAG, "MainActivityonPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(FragmentOne.TAG, "MainActivityonStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(FragmentOne.TAG, "MainActivityonRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(FragmentOne.TAG, "MainActivityonDestroy: ");
    }


    @Override
    public void onClick() {
        mFragmentTwo = new FragmentTwo();
        getFragmentManager().beginTransaction().addToBackStack(null).hide(mFragmentOne).add(R.id.fl, mFragmentTwo, "two").commit();

    }
}
