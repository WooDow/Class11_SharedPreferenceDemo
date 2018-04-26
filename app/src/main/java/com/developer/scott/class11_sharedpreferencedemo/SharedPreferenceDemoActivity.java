package com.developer.scott.class11_sharedpreferencedemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * 偏好設定
 */
public class SharedPreferenceDemoActivity extends AppCompatActivity {

    private static final String FILENAME = "setting";
    private RadioButton rb_A,rb_B,rb_C;
    private CheckBox cb_D,cb_E;
    private SeekBar seekber;
    private EditText editText;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference_demo);

        findviews();
        //writeData();
        //readData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        readData();
    }

    private void readData() {
        SharedPreferences setting = getSharedPreferences(FILENAME,MODE_PRIVATE);
        rb_A.setChecked(setting.getBoolean("rbA",false));
    }

    private void writeData() {
        SharedPreferences settings = getSharedPreferences(FILENAME,MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("rbA",rb_A.isChecked());
        editor.putBoolean("rbB",rb_B.isChecked());
        editor.putBoolean("rbC",rb_C.isChecked());
        editor.putBoolean("cbD",cb_D.isChecked());
        editor.putBoolean("cbE",cb_E.isChecked());
        editor.putInt("seekbar",seekber.getProgress());
        editor.putString("et",editText.getText().toString());
        editor.putBoolean("sw",aSwitch.isChecked());
        editor.commit();


    }

    private void findviews() {
        rb_A = findViewById(R.id.rb_A);
        rb_B = findViewById(R.id.rb_B);
        rb_C = findViewById(R.id.rb_C);
        cb_D = findViewById(R.id.cb_D);
        cb_E = findViewById(R.id.cb_E);
        seekber = findViewById(R.id.seekber);
        editText = findViewById(R.id.editText);
        aSwitch = findViewById(R.id.aSwitch);
    }

    @Override
    protected void onStop() {
        super.onStop();
        writeData();
    }
}
