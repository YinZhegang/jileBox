package com.jilebox.jilebox;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jilebox.jilebox.base.BaseActivity;
import com.jilebox.jilebox.fragments.Collect;
import com.jilebox.jilebox.fragments.Film;
import com.jilebox.jilebox.fragments.Picture;
import com.jilebox.jilebox.fragments.Story;
import com.jilebox.jilebox.fragments.Video;
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
    @BindView(R.id.navigation_view)
    NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    private Video video;
    private Picture picture;
    private Film film;
    private Story story;
    private Collect collect;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setData() {

    }

    @Override
    public void setView() {
        getSupportActionBar().hide();
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                hideAllFragment(ft);
                switch (menuItem.getItemId()){
                    case R.id.video:
                        if (video == null) {
                            video = new Video();
                            ft.add(R.id.contents, video);
                        } else {
                            ft.show(video);
                        }
                        break;
                    case R.id.picture:
                        if (picture == null) {
                            picture = new Picture();
                            ft.add(R.id.contents, picture);
                        } else {
                            ft.show(picture);
                        }
                        break;
                    case R.id.film:
                        if (film == null) {
                            film = new Film();
                            ft.add(R.id.contents, film);
                        } else {
                            ft.show(film);
                        }
                        break;
                    case R.id.story:
                        if (story == null) {
                            story = new Story();
                            ft.add(R.id.contents, story);
                        } else {
                            ft.show(story);
                        }
                        break;
                    case R.id.collect:
                        if (collect == null) {
                            collect = new Collect();
                            ft.add(R.id.contents, collect);
                        } else {
                            ft.show(collect);
                        }
                        break;
                }
                ft.commit();
                return true;
            }
        });
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {

            }

            @Override
            public void onDrawerOpened(@NonNull View view) {

            }

            @Override
            public void onDrawerClosed(@NonNull View view) {

            }

            @Override
            public void onDrawerStateChanged(int i) {

            }
        });
    }
    private void hideAllFragment(FragmentTransaction ft){
        if (video != null) {
            ft.hide(video);
        }
        if (picture != null) {
            ft.hide(picture);
        }
        if (film != null) {
            ft.hide(film);
        }
        if (story != null) {
            ft.hide(story);
        }
        if (collect != null) {
            ft.hide(collect);
        }

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"dddd",Toast.LENGTH_LONG).show();

    }
}
