package com.fauzanadzim.inforiau;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"RS jiwa Tampan","RS Awal Bross","RS Ibnu Sina","RS Mdjamil","RS Ibu Anak"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("RS jiwa Tampan")) {
                a = new Intent(this,RSJiwaTampan.class);
                startActivity(a);


            } else if (pilihan.equals("RS Awal Bross"))
            {

            }else if (pilihan.equals("RS Mdjamil"))
            {

            }else if (pilihan.equals("RS Ibu Anak"))

                startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
