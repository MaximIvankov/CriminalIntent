package com.example.maxim.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by maxim on 15.09.17.
 *
 *
 */

// стр.166 28.09.2017
// стр.219s 02.10.2017
public class Crime {


    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mID = UUID.randomUUID();//присвание уникального идентификатора
        mDate = new Date();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getID() {
        return mID;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }
}