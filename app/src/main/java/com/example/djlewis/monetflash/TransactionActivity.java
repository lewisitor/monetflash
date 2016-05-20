package com.example.djlewis.monetflash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import databasehelper.DbHelper;

public class TransactionActivity extends AppCompatActivity {

    //private ListView listView;
    private ListView obj;
    DbHelper mydb;//object from database helper package

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        mydb=new DbHelper(this);
        ArrayList array_list=mydb.getallhistory();
        //listView = (ListView) findViewById(R.id.transactionsListView);

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
    protected void onResume() {
        super.onResume();
        //load up transactions from DB, online or offline
    }
}
