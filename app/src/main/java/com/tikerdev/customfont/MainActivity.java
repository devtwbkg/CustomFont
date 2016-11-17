package com.tikerdev.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tikerdev.tikerdevlibrary.viewfont.TDevButton;
import com.tikerdev.tikerdevlibrary.viewfont.TDevEditText;
import com.tikerdev.tikerdevlibrary.viewfont.TDevTextView;

public class MainActivity extends AppCompatActivity {

    private Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        font = Typeface.createFromAsset(getAssets(), "Pattaya/Pattaya-Regular.ttf");
        main();
    }


    private void main() {
        setContentView(R.layout.activity_main);
        TDevTextView tvText = (TDevTextView) findViewById(R.id.tvText);
        tvText.setFontName(font);

        TDevButton btnFont = (TDevButton) findViewById(R.id.btnFont);
        btnFont.setFontName(font);

        TDevEditText editText = (TDevEditText) findViewById(R.id.edtFontSystem);
        editText.setFontName(font);
        TDevEditText editTextHint = (TDevEditText) findViewById(R.id.edtFontSystemHint);
        editTextHint.setFontName(font);
    }

}
