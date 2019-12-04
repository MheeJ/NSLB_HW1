package com.example.a20191120hw;

public class General extends Member {
    @Override
    public void Do() {
        super.strWrite = "YES";
        super.Do();
    }
}

