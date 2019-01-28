package com.example.caz.androidfragmentbasicspractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class BookDetailActivity extends AppCompatActivity {

    Book selectedBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        Bundle bundle = getIntent().getExtras();
        selectedBook = (Book)bundle.getSerializable("book");

        TextView tvId = findViewById(R.id.tvPhoneId);
        TextView tvContent = findViewById(R.id.tvPhoneContent);

        tvId.setText(selectedBook.getId());
        tvContent.setText(selectedBook.getContent());
    }

}
