package com.greenfoxacademy.frontend.model;

public class ArrayModel {
    private String what;
    private int[] numbers;
    private int result;

    public ArrayModel(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayModel() {
    }

    public ArrayModel(String what, int[] numbers, int result) {
        this.what = what;
        this.numbers = numbers;
        this.result = result;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
