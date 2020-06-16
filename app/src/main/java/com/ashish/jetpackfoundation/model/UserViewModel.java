package com.ashish.jetpackfoundation.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {

    private MutableLiveData<User>  mutableLiveData;

    public MutableLiveData<User> getMutableLiveData() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            User user = new User();
            user.setName("Ashish");
            user.setEmail("ashishonrise@gmail.com");

            mutableLiveData.setValue(user);
        }
        return mutableLiveData;
    }

    public void setMutableLiveData(MutableLiveData<User> mutableLiveData) {
        this.mutableLiveData = mutableLiveData;
    }
}
