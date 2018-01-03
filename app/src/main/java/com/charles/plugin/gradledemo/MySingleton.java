package com.charles.plugin.gradledemo;

import java.io.Serializable;

/**
 * @author 17111980
 * @date 2018/1/3.
 */


public class MySingleton implements Serializable {
    private static final long serialVersionUID = 5852078463222747168L;
    private static volatile MySingleton singleton;
    private static boolean isFirst = true;

    private MySingleton() {
        if (isFirst) {
            isFirst = false;
        } else {
            throw new RuntimeException("破坏了单列，第二个实列创建失败");
        }
    }

    public static MySingleton getInstance() {
        if (singleton == null) {
            synchronized (MySingleton.class) {
                if (singleton == null) {
                    singleton = new MySingleton();
                }
            }
        }
        return singleton;
    }

    //序列化安全
    private Object readResolve() {
        return singleton;
    }
}
