package com.example.healer.pyeonchang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by cmjh9 on 2017-11-20.
 */

public class LoadingActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_activity);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //hasFocus = true : 화면에 나왔다.
        //hasFocus = false : 화면에서 사라졌다.
        if(hasFocus){
            startCountDown();
        }
    }

    private int count = 2;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //1.count를 하나 제거!
            count = count - 1 ;

            if(count == 0) {

                Intent intent = new Intent();
                intent.setClass(LoadingActivity.this, SelectMainActivity.class);
                startActivity(intent);
                finish();
                return;
            }

            startCountDown();
        }
    };

    private void startCountDown() {
        handler.sendEmptyMessageDelayed(1000,1000); //밀리 세컨드기 때문에 1000을 1초로 줘야함.


    }





}
