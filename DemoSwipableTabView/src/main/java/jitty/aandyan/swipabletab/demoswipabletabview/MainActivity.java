package jitty.aandyan.swipabletab.demoswipabletabview;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import jitty.aandyan.SwipableTabView.SwipeTabView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout SwipableViewTabConntainer=(LinearLayout)findViewById(R.id.SwipableTabViewContainer);
        ArrayList<String> titles=new ArrayList<String>();
        titles.add("One");
        titles.add("Two");
        titles.add("Three");
        titles.add("Four");
        titles.add("Five");


        ArrayList<Fragment> fragments=new ArrayList<Fragment>();
        for(int i=0;i<titles.size();i++)
        {
            fragments.add(new Dummyfragment(titles.get(i)));
        }

        SwipeTabView swipeTabView=new SwipeTabView(this,titles,fragments,getSupportFragmentManager());
        SwipableViewTabConntainer.addView(swipeTabView);

    }

}
