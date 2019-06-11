package com.jilebox.jilebox.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        ButterKnife.bind(this);
        setView();
        setData();

    }

    protected <T extends View> T findView(int id){
        return (T)findViewById(id);
    }
    protected  abstract int setLayout();
    public abstract void  setData();
    public abstract void  setView();
    protected void toClass(Context context,Class clazz){
       toClass(context,clazz,null);
    }
    protected void toClass(Context context,Class clazz, Bundle bundle){
        Intent intent = new Intent(context,clazz);
        if(bundle!=null){
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
    protected void toClass(Context context,Class clazz, Bundle bundle,int requestCode){
        Intent intent = new Intent(context,clazz);
        if(bundle!=null){
            intent.putExtras(bundle);
        }
        startActivityForResult(intent,requestCode);
    }

}
