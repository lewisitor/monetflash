package databasehelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by djlewis on 5/19/2016.
 */

 public class DbHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="monetflash.db";
    public static final String HISTORY_TABLE_NAME="history";
    public static final String HISTORY_COLUMN_ID="id";
    public static final String HISTORY_COLUMN_CUSTOMER="customer";
    public static final String HISTORY_COLUMN_AMOUNT="amount";
    public static final String HISTORY_COLUMN_DATE="date";
    public static final String HISTORY_COLUMN_TRANSACTIONID="trans_id";
    public static final String HISTORY_COLUMN_STATUS="status";

    private HashMap mp;

    public DbHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(
                "create table if not exists " +
                        "(id integer primary key auto-increment,customer text,amount text,date text,trans_id text,status text)"

        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }

    public boolean inserthistory (String receiver,String amount,String date,String trans_id,String status){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(HISTORY_COLUMN_CUSTOMER,receiver);
        contentValues.put(HISTORY_COLUMN_AMOUNT,amount);
        contentValues.put(HISTORY_COLUMN_DATE,date);
        contentValues.put(HISTORY_COLUMN_TRANSACTIONID,trans_id);
        contentValues.put(HISTORY_COLUMN_STATUS,status);


        db.insert(HISTORY_TABLE_NAME, null, contentValues);

        return true;
    }

    public int numberOfRows(){
       SQLiteDatabase db=this.getReadableDatabase();
        int numRows=(int) DatabaseUtils.queryNumEntries(db,HISTORY_TABLE_NAME);

        return numRows;
    }

    public ArrayList<String> getallhistory(){

        ArrayList<String> array_list=new ArrayList<String>();

        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("select * from history",null);
        res.moveToFirst();

        while(res.isAfterLast()==false){
            array_list.add(res.getString(res.getColumnIndex(HISTORY_TABLE_NAME)));
        }
        return array_list;
    }
}
