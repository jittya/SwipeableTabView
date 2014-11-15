package jitty.aandyan.swipabletab.demoswipabletabview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jitty Aandyan on 15-11-2014.
 */
public class Dummyfragment extends android.support.v4.app.Fragment {

    String i="";

    public Dummyfragment()
    {

    }
    public Dummyfragment(String i) {
        this.i = i;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dummyfragment,null);
        TextView textView=(TextView) view.findViewById(R.id.txt);
        textView.setText(i);
        return view;
    }
}
