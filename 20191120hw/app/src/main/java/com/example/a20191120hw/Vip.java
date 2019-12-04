package com.example.a20191120hw;

public class Vip extends Member{
    @Override
    public void Do() {
        super.strWrite = "YES";
        super.strRead = "YES";
        super.strRemove = "YES";
        super.Do();
    }
}


