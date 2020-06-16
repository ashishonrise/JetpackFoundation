package com.ashish.jetpackfoundation.model;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.ashish.jetpackfoundation.BR;

public class User  extends BaseObservable {
    String name; String email;
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}
