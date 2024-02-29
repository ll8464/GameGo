package com.ll.gamegoMVC.gamego.ui;

public class UserIOConsoleImpl implements UserIO {

    private String message = "";
    private String prompt = "";
    private int num = 0;
    private double doubleNum = 0.0;
    private float floatNum= 0.0f;
    private long longNum = 0;

    @Override
    public void print(String msg) {
        this.message = msg;
        System.out.println(msg);
    }

    @Override
    public double readDouble(String prompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readDouble'");
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readDouble'");
    }

    @Override
    public float readFloat(String prompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readFloat'");
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readFloat'");
    }

    @Override
    public int readInt(String prompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readInt'");
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readInt'");
    }

    @Override
    public long readLong(String prompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLong'");
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLong'");
    }

    @Override
    public String readString(String prompt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readString'");
    }
    
}
