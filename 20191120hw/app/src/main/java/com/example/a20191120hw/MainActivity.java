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
    /* private Button mBtnLog, mBtnManage, mBtnWrite, mBtnRemove, mBtnRead;*/
    private Button [] mBtnArray = new Button[5];
    /*
        private String a = "a";
        private String b = "a";
        private String c = "a";
        private String d = "a";
    */
    private String action[] = new String[4];
    private String act_msg[] = {"글쓰기","삭제","읽기","관리"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGUI();


    }

    private void initGUI() {

        for (int i = 0; i < action.length; i++) {
            action[i] = "a";
        }

        for (int j = 0; j < 5; j++) {
            mBtnArray[j] = (Button) findViewById(R.id.btn1 + j);
            mBtnArray[j].setOnClickListener(this);
        }

        mLogin = (EditText) findViewById(R.id.text_log);
        mManage = (TextView) findViewById(R.id.text_power);

        //this 뭐 적는거 있음
        manager.onMemberListener(this);
        general.onMemberListener(this);
        vip.onMemberListener(this);

         /* mBtnManage = (Button)findViewById(R.id.btn_manage);
        mBtnLog = (Button)findViewById(R.id.btn_log);
        mBtnRead = (Button)findViewById(R.id.btn_read);
        mBtnRemove = (Button)findViewById(R.id.btn_remove);
        mBtnWrite = (Button)findViewById(R.id.btn_write);*/

      /*  mBtnWrite.setOnClickListener(this);
        mBtnRemove.setOnClickListener(this);
        mBtnManage.setOnClickListener(this);
        mBtnRead.setOnClickListener(this);
        mBtnLog.setOnClickListener(this);*/

    }


    @Override
    public void onClick(View view) {

            if(view.getId() == mBtnArray[4].getId()){
                text_login = mLogin.getText().toString();
                if (text_login.equals("일반회원")) {
                    mManage.setText(text_login);
                    general.Do();
                } else if (text_login.equals("정회원")) {
                    mManage.setText(text_login);
                    vip.Do();
                } else if (text_login.equals("관리자")) {
                    mManage.setText(text_login);
                    manager.Do();
                } else {
                    mManage.setText("로그인해!");
                    //member.Do();
                }
            }

        for(int i=0;i<4;i++){
            if(view.getId() == mBtnArray[i].getId()){
                if (action[i].equals("YES")) {
                    mManage.setText(act_msg[i]);
                } else {
                    mManage.setText(act_msg[i]+"못하지롱");
                }
            }
        }

          /*  switch (view.getId()) {


                case R.id.btn5:
                    text_login = mLogin.getText().toString();
                    if (text_login.equals("일반회원")) {
                        mManage.setText(text_login);
                        general.Do();
                    } else if (text_login.equals("정회원")) {
                        mManage.setText(text_login);
                        vip.Do();
                    } else if (text_login.equals("관리자")) {
                        mManage.setText(text_login);
                        manager.Do();
                    } else {
                        mManage.setText("로그인해!");
                        //member.Do();
                    }
                    break;


                case R.id.btn1:
                    if (action[0].equals("YES")) {
                        mManage.setText("글쓰기");
                    } else {
                        mManage.setText("글쓰기 못하지롱");
                    }
                    break;

                case R.id.btn2:
                    if (action[1].equals("YES")) {
                        mManage.setText("삭제");
                    } else {
                        mManage.setText("삭제 못하지롱~");
                    }
                    break;

                case R.id.btn3:
                    if (action[2].equals("YES")) {
                        mManage.setText("읽기");
                    } else {
                        mManage.setText("읽기 못하지롱!!");
                    }
                    break;

                case R.id.btn4:
                    if (action[3].equals("YES")) {
                        mManage.setText("관리");
                    } else {
                        mManage.setText("관리 못하지롱~");
                    }
                    break;

                default:
                    break;
            }*/

    }



    public void onDo(String write, String remove, String read, String mag){
        action[0] = write;
        action[1] = remove;
        action[2] = read;
        action[3] = mag;
    }

}