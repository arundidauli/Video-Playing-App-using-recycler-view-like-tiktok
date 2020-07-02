package com.wingshield.technologies.ijkmediaplayer;

public class UserClips {
    public String name;
    public String city;
    public String hobbies;
    public int url;

    public UserClips(String name, String city, String hobbies, int url) {
        this.name = name;
        this.city = city;
        this.hobbies = hobbies;
        this.url = url;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }
}
