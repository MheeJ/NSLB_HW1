package com.example.a20191120hw;

public class Manager extends Member {
    @Override
    public void Do() {
        super.strWrite = "YES";
        super.strRemove = "YES";
        super.strRead = "YES";
        super.strMag = "YES";
        super.Do();
    }
}


