package com.jilebox.jilebox;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.jilebox.jilebox.base.BaseActivity;
import com.jilebox.jilebox.util.BottomNavigationViewHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.contents)
    FrameLayout contents;
    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.outer_content)
    LinearLayout outerContent;
    @BindView(R.id.frameLayout)
    FrameLayout frameLayout;
//    @BindView(R.id.navigation_view)
//    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setData() {

    }

    @Override
    public void setView() {
//        getSupportActionBar().hide();
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
