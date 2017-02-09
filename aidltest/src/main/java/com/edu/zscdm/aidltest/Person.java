package com.edu.zscdm.aidltest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ZSCDM on 2017/2/9.
 * 作者邮箱：2712220318@qq.com
 */

public class Person implements Parcelable {
    private String name;
    public Person(){

    }

    public Person(Parcel in) {
        super();
        name = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
