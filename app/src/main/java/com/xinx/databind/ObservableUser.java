package com.xinx.databind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ObservableUser extends BaseObservable {

    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
