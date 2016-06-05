package com.example.djlewis.monetflash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
//import com.orm.SugarApp;
import com.example.djlewis.monetflash.app.Transactions;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

//import databasehelper.DbHelper;

public class TransactionActivity extends AppCompatActivity{

    //private ListView listView;
    private ListView obj;
  //  DbHelper mydb;//object from database helper package

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

    //    mydb=new DbHelper(this);
        //ArrayList array_list=mydb.getallhistory();
                    //        List<Transactions> list_view= Transactions.listAll(Transactions.class);
        List<Transactions> list_view=Transactions.findWithQuery(Transactions.class,"Select * from Transactions","order by date");
        //listView = (ListView) findViewById(R.id.transactionsListView);

        //in the advent of elements aren't found in the Database
        if(list_view.isEmpty()){
            Toast.makeText(this, "No History Found In Database", Toast.LENGTH_LONG).show();
        }
        else {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list_view);
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
