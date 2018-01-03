package com.charles.plugin.gradledemo.parcelable;

/**
 * @author 17111980
 * @date 2018/1/3.
 */


public class Singleton {
    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }


}
