package com.example.laptrinhdidong_lab6_29_3.model;

public class giay {
    private int id;
    private int img;
    private String dis1;
    private String dis2;

    public giay(int id, int img, String dis1, String dis2) {
        this.id = id;
        this.img = img;
        this.dis1 = dis1;
        this.dis2 = dis2;
    }

    public giay(int img, String dis1, String dis2) {
        this.img = img;
        this.dis1 = dis1;
        this.dis2 = dis2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDis1() {
        return dis1;
    }

    public void setDis1(String dis1) {
        this.dis1 = dis1;
    }

    public String getDis2() {
        return dis2;
    }

    public void setDis2(String dis2) {
        this.dis2 = dis2;
    }
}
