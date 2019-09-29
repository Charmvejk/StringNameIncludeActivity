package com.example.stringnameincludeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (str.indexOf(mKey)==-1){
//            SpannableString txt = new SpannableString(str);
//            txt.setSpan(new ForegroundColorSpan(Color.parseColor("#ff0000")), 0, mKey.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
//            txtValue.setText(txt);
//        }
//        txtTitle.setText(value.getTitle());
    }
}
