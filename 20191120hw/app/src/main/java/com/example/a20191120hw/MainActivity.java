package com.example.a20191120hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,MemberListener {

    private EditText mLogin;
    private String text_login = "회원정보";
    private TextView mManage;
    private String mmManage;
    private Member member = new Member();
    private Manager manager = new Manager();
    private General general = new General();
    private Vip vip = new Vip();
    private Button mBtnLog, mBtnManage, mBtnWrite, mBtnRemove, mBtnRead;
    private String a = "a";
    private String b = "a";
    private String c = "a";
    private String d = "a";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();


    }

    private void initGUI(){

        mLogin = (EditText)findViewById(R.id.text_log);
        mBtnManage = (Button)findViewById(R.id.btn_manage);
        mBtnLog = (Button)findViewById(R.id.btn_log);
        mBtnRead = (Button)findViewById(R.id.btn_read);
        mBtnRemove = (Button)findViewById(R.id.btn_remove);
        mBtnWrite = (Button)findViewById(R.id.btn_write);
        mManage = (TextView)findViewById(R.id.text_power);

        //this 뭐 적는거 있음
        manager.onMemberListener(this);
        general.onMemberListener(this);
        vip.onMemberListener(this);

        mBtnWrite.setOnClickListener(this);
        mBtnRemove.setOnClickListener(this);
        mBtnManage.setOnClickListener(this);
        mBtnRead.setOnClickListener(this);
        mBtnLog.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_log:
                text_login = mLogin.getText().toString();
                if(text_login.equals("일반회원")){
                    mManage.setText(text_login);
                    general.Do();
                }
                else if(text_login.equals("정회원")){
                    mManage.setText(text_login);
                    vip.Do();
                }
                else if(text_login.equals("관리자")){
                    mManage.setText(text_login);
                    manager.Do();
                }
                else{
                    mManage.setText("로그인해!");
                    //member.Do();
                }
                break;

            case R.id.btn_write:
                   if(a.equals("YES")) {
                       mManage.setText("글쓰기");
                   }
                   else {
                       mManage.setText("글쓰기 못하지롱");
                   }
                   break;

            case R.id.btn_remove :
                   if(b.equals("YES")) {
                       mManage.setText("삭제");
                   }
                   else {
                       mManage.setText("삭제 못하지롱~");
                   }
                   break;

            case R.id.btn_read :
                   if(c.equals("YES")) {
                       mManage.setText("읽기");
                   }
                   else {
                       mManage.setText("읽기 못하지롱!!");
                   }
                   break;

            case R.id.btn_manage :
                   if(d.equals("YES")) {
                       mManage.setText("관리");
                   }
                   else {
                       mManage.setText("관리 못하지롱~");
                   }
                   break;

               default :
                   break;
           }
       }



    public void onDo(String write, String remove, String read, String mag){
        a = write;
        b = remove;
        c = read;
        d = mag;
    }




}
