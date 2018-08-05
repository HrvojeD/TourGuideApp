package com.example.android.tourguideapp;


public class Content {

    public int mImageResourceId;
    public int mDescription;


    /*
    constructor for Content class
     */
    public Content (int imageResourceId, int description){
        mImageResourceId = imageResourceId;
        mDescription = description;
    }

    /*
    get image resource id
     */
    public int getmImageResourceId(){
        return mImageResourceId;
    }

    /*
    get description
     */
    public int getmDescription() {
        return mDescription;
    }
}
