package com.example.caz.androidfragmentbasicspractice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements BookFragment.OnListFragmentInteractionListener, DetailsFragment.OnFragmentInteractionListener {

    // Charles Godoy
    // Android Fragments Basics

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(Book item) {

        if(getResources().getBoolean(R.bool.is_tablet)){

            DetailsFragment fragment = new DetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("book", item);
            fragment.setArguments(bundle);

            getSupportFragmentManager().beginTransaction().replace(R.id.detailFrameLayout, fragment).commit();

        } else {

            Intent intent = new Intent(MainActivity.this, BookDetailActivity.class);
            intent.putExtra("book", item);
            startActivity(intent);
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
