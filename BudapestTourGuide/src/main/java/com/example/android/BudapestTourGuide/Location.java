package com.example.android.BudapestTourGuide;


//declaration of the class */
public class Location {
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * create a word object using a constructor - no return value
     */
    /**
     * description of the attraction (it can be phone number or opening hours)
     */
    private String mAttractionDescription;
    /**
     * the name of the attraction (it can be sightseeing, restaurant, thermal bath or cake shop)
     */
    private String mAttractionName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Location(String attractionDescription, String attractionName) {
        mAttractionDescription = attractionDescription;
        mAttractionName = attractionName;
    }

    /**
     * get the default translation of the word - methods
     */

    public Location(String attractionDescription, String attractionName, int ImageResourceId) {
        mAttractionDescription = attractionDescription;
        mAttractionName = attractionName;
        mImageResourceId = ImageResourceId;
    }

    public String getmAttractionDescription() {
        return mAttractionDescription;
    }

    public String getmAttractionName() {
        return mAttractionName;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Location{" +
                "mAttractionName='" + mAttractionName + '\'' +
                ", mAttractionDescription='" + mAttractionDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}

