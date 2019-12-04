package com.example.a20191120hw;

public class Member {
    private MemberListener memberListener = null;
    protected String strWrite = "NO";
    protected String strRemove = "NO";
    protected String strRead = "NO";
    protected String strMag = "NO";


    public void Do(){
       memberListener.onDo(strWrite,strRemove,strRead,strMag);
   }

   public void run(){

   }

    public void onMemberListener(MemberListener listener){
        this.memberListener = listener;
    }
}


