package com.example.hzcj.mydialogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private MyDialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_alert= (TextView) findViewById(R.id.tv_alert);
        //设置监听事件
        tv_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.show();
            }
        });
//        myDialog = new MyDialog(this, R.style.Dialog);
        myDialog = new MyDialog(this, R.style.Alert_Dialog);
        myDialog.setOnClickOkListener(new MyDialog.OnClickListener() {
            @Override
            public void onClick(String string) {
                if("确定".equals(string)){
                    Toast.makeText(MainActivity.this,"你点击了确定",Toast.LENGTH_SHORT).show();
                    myDialog.dismiss();
                }else if("取消".equals(string)){
                    Toast.makeText(MainActivity.this,"你点击了取消",Toast.LENGTH_SHORT).show();
                    myDialog.dismiss();
                }
            }
        });

    }
}
