package com.example.r00136656.finalassign;

/**
 * Created by R00136656 on 01/12/2017.
 */
import java.util.ArrayList;
        import java.util.HashMap;

        import android.app.Activity;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

import static android.R.attr.data;
import static android.R.id.title;

public class Adapter extends BaseAdapter {

    private Activity activity;
    private ArrayList lt;
    HashMap lt;
    String gt;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;

    public Adapter(Activity a, ArrayList&lt;HashMap&lt;String, String&gt;&gt; d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);

        TextView champ = (TextView)vi.findViewById(R.id.champ);
        TextView favoriteitem = (TextView)vi.findViewById(R.id.favoriteitem);
        TextView tier = (TextView)vi.findViewById(R.id.tier);
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image);

        HashMap&lt;String, String&gt; song = new HashMap&lt;String, String&gt;();
        champ = data.get(position);


        champ.setText(champ.get(CustomizedListView.KEY_TITLE));
        favoriteitem.setText(champ.get(CustomizedListView.KEY_ARTIST));
        tier.setText(champ.get(CustomizedListView.KEY_DURATION));
        imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
        return vi;
    }
}