package com.example.d.tourguidebp;

import android.location.Location;

/**
 * Created by d on 7/30/2017.
 * Class to store all data about tourist information.
 */

public class TouristItem {
    private static int NO_IMAGE = -1;
    private int mIconimage = NO_IMAGE;
    private String mName;
    private String mDescription;
    private String mLocation = null;
    private String mPhoneNo = null;
    private String mWebAddress = null;

    //Constructor for object for Point Of Interest
    public TouristItem(int img, String name, String desc, String loc) {
        mIconimage = img;
        mName = name;
        mDescription = desc;
        mLocation = loc;
    }

    //Constructor for object for Restaurant
    public TouristItem(int img, String name, String desc, String loc, String phone, String www) {
        mIconimage = img;
        mName = name;
        mDescription = desc;
        mLocation = loc;
        mPhoneNo = phone;
        mWebAddress = www;
    }

    //Constructor for object for Transport mode
    public TouristItem(int img, String name, String desc, String phone, String www) {
        mIconimage = img;
        mName = name;
        mDescription = desc;
        mPhoneNo = phone;
        mWebAddress = www;
    }

    //Constructor for object for Hungarian Phrase
    public TouristItem(String name, String desc) {
        mName = name;
        mDescription = desc;
    }

    /**
     * getter method for the image
     *
     * @return iconimage location
     */
    public int getmIconimage() {
        return mIconimage;
    }

    /**
     * getter method for name
     *
     * @return name string variable
     */
    public String getmName() {
        return mName;
    }

    /**
     * getter method for description
     *
     * @return description string variable
     */
    public String getmDescription() {
        return mDescription;
    }

    /**
     * getter method for location
     *
     * @return location String variable
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * getter method for phone number
     *
     * @return phone number string variable
     */
    public String getmPhoneNo() {
        return mPhoneNo;
    }

    /**
     * getter method for web address
     *
     * @return web address string variable
     */
    public String getmWebAddress() {
        return mWebAddress;
    }

    /**
     * checks if there is image in the TouristItem object
     *
     * @return boolean true if the TouristItem object has image address
     */
    public boolean hasImage() {
        return mIconimage != NO_IMAGE;
    }

    public boolean hasMapInfo() {
        return mLocation != null;
    }

    public boolean hasPhone() {
        return mPhoneNo != null;
    }

    public boolean hasWww() {
        return mWebAddress != null;
    }
}
