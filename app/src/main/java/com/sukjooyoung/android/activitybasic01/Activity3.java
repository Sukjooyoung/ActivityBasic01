package com.sukjooyoung.android.activitybasic01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

/**
 * Created by suk on 2016-09-20.
 * 수동으로 activity만들기
 * 1. activity 클래스 상속
 * 2. onCreate method 안에서 뷰.xml을 SetContentView 함수로 세팅
 * 3.
 */
public class Activity3 extends Activity{
    private static final String TAG = "Activity3";
    @Override //1 액티비티 생성 시 호출되는 함수
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.i("TAG","called onCreate");

    }

    public void openActivity4(View v){
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
    }
    public void openActivity5(View v){
        Intent intent = new Intent(this,Activity5.class);
        startActivity(intent);

    }








    @Override // 2 화면에 나타나기 바로 직전에 호출되는 함수
    protected void onStart() {
        super.onStart();
        Log.i("TAG","called onStart");
    }
    // 3 이때 사용자가 화면에 입력할 수 있게 된다. (반투명 상태일 때는 resume으로 가고 stop일때는 restart로 간다.)
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG","called onResume");
    }

    @Override // 4. 화면에서 사라졌을 때이지만, 액티비티가 나를 일부만 가리고 있을 때
    protected void onPause() {
        // Activity가 동작하고 있는중
        super.onPause();
        Log.i("TAG","called onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG","called onStop");
    }

    // 5.1 stop되였던 Activity가 다시 호출될 때
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG","called onRestart");
    }
    // 6.앱이 종료되면(메모리에서 해제되면)
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG","called onDestroy");
    }
}
