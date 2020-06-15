package com.ashish.jetpackfoundation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ashish.jetpackfoundation.DataBinderMapperImpl;
import com.ashish.jetpackfoundation.R;
import com.ashish.jetpackfoundation.databinding.ActivityMainBinding;
import com.ashish.jetpackfoundation.handler.ClickHandler;
import com.ashish.jetpackfoundation.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();
        user.setName("Ashish");
        user.setEmail("ashishonrise@gmail.com");

        mainBinding.setUser(user);


        //Add Handler
        ClickHandler clickHandler = new ClickHandler(this);
        mainBinding.setHandler(clickHandler);
    }
}