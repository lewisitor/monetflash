package com.example.djlewis.monetflash;
//package databasehelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import databasehelper.DbHelper;

/**
 * Created by djlewis on 5/19/2016.
 */

public class HistoryActivity extends AppCompatActivity {

private ListView obj;
DbHelper mydb;//object from database helper package

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mydb=new DbHelper(this);
        ArrayList array_list=mydb.getallhistory();
        //in the advent of elements aren't found in the Database
    if(array_list.isEmpty()){
        Toast.makeText(this, "No History Found In Database", Toast.LENGTH_LONG).show();
    }
        else {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array_list);
        obj=(ListView)findViewById(R.id.transactionsListView);
        obj.setAdapter(arrayAdapter);

    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        //DO NOTHING
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.action_settings:
                Toast.makeText(this, "Settings is Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_history:
                Toast.makeText(this, "History is Clicked", Toast.LENGTH_LONG).show();
                break;
        }
        //noinspection SimplifiableIfStatement
 /*       if (id == R.id.action_settings) {
            Toast.makeText(this, "Settings is Clicked", Toast.LENGTH_LONG).show();
            return true;
        }
*/

        return super.onOptionsItemSelected(item);
    }
}
