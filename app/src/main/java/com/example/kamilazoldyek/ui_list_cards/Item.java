package com.example.kamilazoldyek.ui_list_cards;

public class Item {

    int background;
    int profilePhoto;
    String profileName;
    int nbFollowers;

    public Item(){

    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Item(String profileName, int background, int profilePhoto, int nbFollowers) {
        this.profileName = getProfileName();
        this.background = background;
        this.profilePhoto = profilePhoto;
        this.nbFollowers = nbFollowers;

    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}
