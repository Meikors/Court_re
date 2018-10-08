package com.example.administrator.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView scoreA;
    TextView scoreB;

    String TAG=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA=(TextView) findViewById(R.id.scoreA);
        scoreB=(TextView) findViewById(R.id.scoreB);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //在屏幕旋转时保存数据
        outState.putFloat("scoreA",Float.parseFloat(scoreA.getText().toString()));
        outState.putFloat("scoreB",Float.parseFloat(scoreB.getText().toString()));
        super.onSaveInstanceState(outState);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        scoreA.setText(String.valueOf(savedInstanceState.getFloat("ScoreA")));
        scoreB.setText(String.valueOf(savedInstanceState.getFloat("scoreB")));
        super.onRestoreInstanceState(savedInstanceState);
        //恢复数据
    }

    public void pressAdd3_A(View btn){
        showSoreA(3);
    }
    public void pressAdd3_B(View btn){
        showSoreB(3);
    }
    public void pressAdd2_A(View btn){
        showSoreA(2);
    }
    public void pressAdd2_B(View btn){
        showSoreB(2);
    }
    private void showSoreA(int a){
        int sa=Integer.parseInt(scoreA.getText().toString());
        sa+=a;
        scoreA.setText(sa+"");
    }
    public void throwA(View btn){
        showSoreA(1);
    }
    public void throwB(View btn){
        showSoreB(1);
    }
    private void showSoreB(int a){
        int sa=Integer.parseInt(scoreB.getText().toString());
        sa+=a;
        scoreB.setText(sa+"");
    }
    public void Reset(View btn){
        scoreA.setText(0+"");
        scoreB.setText(0+"");
    }
}
