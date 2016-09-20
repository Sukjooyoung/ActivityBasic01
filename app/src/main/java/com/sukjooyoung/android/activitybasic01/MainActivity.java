package com.sukjooyoung.android.activitybasic01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCall(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"));
        startActivity(intent); //action_dial이 하나의 액티비티라는 말
    }
    public void openSMS(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:01012345678"));
        startActivity(intent); //action_dial이 하나의 액티비티라는 말
    }
    public void openNaver(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent); //action_dial이 하나의 액티비티라는 말

    }



    //액티비티 호출하는 함수
    // 버ㄴ에서 호출하기 위해 파라미터를 뷰로 설정해야만 한다.
    public void openActivity(View v){
        // 1. Activity를 호출하는 로직
        //2. 인텐트를 생성  컨텍스트(activity는 this넘겨줌)를 넘겨준다
        Intent intent = new Intent(this , Activity2.class);
                            // 호출할 액티비티 클래스명
        // 생성된 인텐트를 시스템에 넘겨서 실행
        startActivity(intent);
    }

    public void openMe(View v){
        // 1. Activity를 호출하는 로직
        //2. 인텐트를 생성  컨텍스트(activity는 this넘겨줌)를 넘겨준다
        Intent intent = new Intent(this , MainActivity.class);
        // 호출할 액티비티 클래스명
        // 생성된 인텐트를 시스템에 넘겨서 실행
        startActivity(intent);
    }



}





