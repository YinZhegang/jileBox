package com.jilebox.jilebox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jilebox.jilebox.base.BaseActivity;

public class Welcome extends BaseActivity {

    @Override
    protected int setLayout() {
        return R.layout.activity_welcome;
    }

    @Override
    public void setData() {
        toClass(Welcome.this,MainActivity.class);
    }

    @Override
    public void setView() {

    }

    @Override
    public void onClick(View v) {

    }

}
