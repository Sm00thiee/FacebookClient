package vn.edu.usth.facebookclient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

//    private static final String[] title = {"@drawable/home.png", "@drawable/notifi.png", "@drawable/menu.png"};
    private static final int PAGE_COUNT = 3;
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new MenuFragment();
            case 1: return new MenuFragment();
            case 2: return new MenuFragment();
        }
        return new Fragment();
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }
}

