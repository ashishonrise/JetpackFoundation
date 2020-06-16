package com.ashish.jetpackfoundation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.ashish.jetpackfoundation.DataBinderMapperImpl;
import com.ashish.jetpackfoundation.R;
import com.ashish.jetpackfoundation.databinding.ActivityMainBinding;
import com.ashish.jetpackfoundation.handler.ClickHandler;
import com.ashish.jetpackfoundation.model.User;
import com.ashish.jetpackfoundation.model.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        
        UserViewModel userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        userViewModel.getMutableLiveData().observe(this, new Observer<User>() {
                    @Override
                    public void onChanged(User user) {
                        mainBinding.setUser(user);
                    }
                });
                //Add Handler
                ClickHandler clickHandler = new ClickHandler(this);
                mainBinding.setHandler(clickHandler);
    }
}