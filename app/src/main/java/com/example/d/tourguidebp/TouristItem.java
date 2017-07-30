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
    private double mLongitude;
    private double mLatitude;
    private String mPhoneNo;
    private String mWebAddress;

    //Constructor for object for Point Of Interest
    public TouristItem(int img, String name, String desc, double lon, double lat) {
        mIconimage = img;
        mName = name;
        mDescription = desc;
        mLongitude = lon;
        mLatitude = lat;
    }

    //Constructor for object for Restaurant
    public TouristItem(int img, String name, String desc, double lon, double lat, String phone, String www) {
        mIconimage = img;
        mName = name;
        mDescription = desc;
        mLongitude = lon;
        mLatitude = lat;
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
    public TouristItem(int img, String name, String desc) {
        mIconimage = img;
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

    private Location createNewLocation(double longitude, double latitude) {
        Location location = new Location("dummyprovider");
        location.setLongitude(longitude);
        location.setLatitude(latitude);
        return location;
    }

    /**
     * getter method for location
     *
     * @return location variable
     */
    public Location getMyLoc() {
        return createNewLocation(mLongitude, mLatitude);
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
}
