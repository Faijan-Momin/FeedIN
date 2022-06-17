package com.faijan.feedin.HelperClass;

public class FoodCardHelperClass {
    private String chapati, dryBhaji, wetBhaji, rice, bestBefore,uploadedAt,
            foodStatus,foodImage, foodLocation,userName, donatedTo, review, dbLoc ,requestedOn,acceptedOn, latLong;

    public FoodCardHelperClass() {
    }

    public FoodCardHelperClass(String chapati , String dryBhaji , String wetBhaji , String rice , String foodImage ,
                               String bestBefore , String uploadedAt , String foodStatus , String foodLocation ,
                               String userName , String donatedTo , String review, String dbLoc, String requestedOn,String acceptedOn,String latLong) {
        this.chapati = chapati;
        this.dryBhaji = dryBhaji;
        this.wetBhaji = wetBhaji;
        this.rice = rice;
        this.foodImage = foodImage;
        this.bestBefore = bestBefore;
        this.uploadedAt = uploadedAt;
        this.foodStatus = foodStatus;
        this.foodLocation = foodLocation;
        this.userName = userName;
        this.donatedTo = donatedTo;
        this.review = review;
        this.dbLoc = dbLoc;
        this.requestedOn = requestedOn;
        this.acceptedOn = acceptedOn;
        this.latLong = latLong;
    }

    public String getChapati() {
        return chapati;
    }

    public void setChapati(String chapati) {
        this.chapati = chapati;
    }

    public String getDryBhaji() {
        return dryBhaji;
    }

    public void setDryBhaji(String dryBhaji) {
        this.dryBhaji = dryBhaji;
    }

    public String getWetBhaji() {
        return wetBhaji;
    }

    public void setWetBhaji(String wetBhaji) {
        this.wetBhaji = wetBhaji;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(String uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public String getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(String foodStatus) {
        this.foodStatus = foodStatus;
    }

    public String getFoodLocation() {
        return foodLocation;
    }

    public void setFoodLocation(String foodLocation) {
        this.foodLocation = foodLocation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDonatedTo() {
        return donatedTo;
    }

    public void setDonatedTo(String donatedTo) {
        this.donatedTo = donatedTo;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getDbLoc() {
        return dbLoc;
    }

    public void setDbLoc(String dbLoc) {
        this.dbLoc = dbLoc;
    }

    public String getRequestedOn() {
        return requestedOn;
    }

    public void setRequestedOn(String requestedOn) {
        this.requestedOn = requestedOn;
    }

    public String getAcceptedOn() {
        return acceptedOn;
    }

    public void setAcceptedOn(String acceptedOn) {
        this.acceptedOn = acceptedOn;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }
}
