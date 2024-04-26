package com.example.day02;

public class Book {
    private String title;
    static int price;

    //메소드
    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter
    // setter, getter - 프로퍼티(property) - price 프로퍼티
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}