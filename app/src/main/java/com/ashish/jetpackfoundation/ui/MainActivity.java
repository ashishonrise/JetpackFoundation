package com.ashish.jetpackfoundation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.database.Observable;
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

        // Create the observer which updates the UI.
        Observer<User> observer = new Observer<User>() {
            @Override
            public void onChanged(User user) {
                // Update the UI
                mainBinding.setUser(user);
            }
        };
        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        userViewModel.getMutableLiveData().observe(this, observer);

                //Add Handler
                ClickHandler clickHandler = new ClickHandler(this);
                mainBinding.setHandler(clickHandler);
    }
}