package com.ashish.jetpackfoundation.handler;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.ashish.jetpackfoundation.model.User;

public class ClickHandler {

    Context context;
    public ClickHandler(Context context) {
        this.context = context;
    }


    public void onButtonClick(View v){
        Toast.makeText(context, "onButtonClick", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClickWithParam(View view, User user){
        Toast.makeText(context, "onButtonClickParam : Name : "+user.getName(), Toast.LENGTH_SHORT).show();
    }

    public boolean onButtonLongClick(View view){
        Toast.makeText(context, "onButtonLongClick", Toast.LENGTH_SHORT).show();
        return false;
    }

}
