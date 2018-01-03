package com.charles.plugin.gradledemo.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author 17111980
 * @date 2017/12/29.
 */


public class UserModel implements Parcelable {

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            UserModel userModel = new UserModel();
            userModel.setAge(in.readString());
            userModel.setName(in.readString());
            userModel.setSex(in.readString());
            return userModel;
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        // 1.必须按成员变量声明的顺序封装数据，不然会出现获取数据出错
        // 2.序列化对象
        parcel.writeString(age);
        parcel.writeString(name);
        parcel.writeString(sex);
    }

    public UserModel() {
    }

    public UserModel(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private String name;
    private String age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
