package com.example.layoutinflatersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //正常に作動
        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setText("TEST");

        //この状態ではエラーが起こる。
//        Button btn2 = (Button) findViewById(R.id.button2);
//        btn2.setText("TEST");

        //inflateでlayoutを取得
        LayoutInflater inflater = LayoutInflater.from(this);
        RelativeLayout testLayout = (RelativeLayout) inflater.inflate(R.layout.test,null);

        //addviewで追加
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.activity_main);
        mainLayout.addView(testLayout);

        //正常に動作する。
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setText("TEST");



    }
}
