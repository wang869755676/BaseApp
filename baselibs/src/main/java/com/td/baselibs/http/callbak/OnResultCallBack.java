package com.td.baselibs.http.callbak;

import java.lang.reflect.Type;

import io.reactivex.disposables.Disposable;

public abstract class OnResultCallBack<T> {
    public static Type genType = null;

    public OnResultCallBack() {
        genType = getClass().getGenericSuperclass();
    }

    public abstract void onSuccess(T t);

    public abstract void onError(int code, String errorMsg);

    public abstract void onSubscribe(Disposable d);
}
