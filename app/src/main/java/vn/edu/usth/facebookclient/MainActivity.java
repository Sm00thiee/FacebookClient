package vn.edu.usth.facebookclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Facebook client";

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {R.drawable.home, R.drawable.notifi, R.drawable.menu};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), 1);
        adapter.AddFragment(new FragmentFirst());
        adapter.AddFragment(new FragmentSecond());
        adapter.AddFragment(new FragmentThird());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < 3; i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
        MenuFragment fragment = new MenuFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.mainActivity, fragment).commit();
        Log.i(TAG, "onCreate()'ed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()'ed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()'ed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()'ed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()'ed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()'ed");
    }

}