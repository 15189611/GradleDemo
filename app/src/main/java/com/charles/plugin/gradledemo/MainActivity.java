package com.charles.plugin.gradledemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.charles.plugin.gradledemo.parcelable.MyUserModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = new File(Environment.getExternalStorageDirectory(),
                "abc.txt");
        try {
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
            oout.writeObject(new MyUserModel("xiappan333333", 123));
            oout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("序列化成功");

        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
            Object o = oin.readObject();
            oin.close();
            System.out.println("反序列化成功:" + ((MyUserModel) o).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
