package com.example.fruitlistview;

/**
 * Created by 付存哲kk on 2017/3/3.
 */

public class Fruit {

    public String name;

    public int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
