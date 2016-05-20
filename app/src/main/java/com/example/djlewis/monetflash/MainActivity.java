package com.example.djlewis.monetflash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
           // Toast.makeText(this, "History is Clicked", Toast.LENGTH_LONG).show();
            Intent h= new Intent(this,TransactionActivity.class);
            startActivity(h);
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
