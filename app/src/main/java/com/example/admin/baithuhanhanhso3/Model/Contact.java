package com.example.admin.baithuhanhanhso3.Model;

public class Contact {

    private int mAvatar;
    private String mName;
    private String mNumber;

    public Contact(int mAvatar, String mName, String mNumber) {
        this.mAvatar = mAvatar;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public int getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(int mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
