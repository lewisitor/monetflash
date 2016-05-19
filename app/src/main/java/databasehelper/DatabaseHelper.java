package databasehelper;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import java.util.HashMap;

/**
 * Created by djlewis on 5/19/2016.
 */

 public abstract class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="monetflash.db";
    public static final String HISTORY_TABLE_NAME="history";
    public static final String HISTORY_COLUMN_ID="id";
    public static final String HISTORY_COLUMN_RECEIVER="receiver";
    public static final String HISTORY_COLUMN_AMOUNT="amount";
    public static final String HISTORY_COLUMN_DATE="date";
    public static final String HISTORY_COLUMN_TIME="time";

    private HashMap mp;

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(
             "create table if not exists " +
                     "(id integer primary key auto-increment,receiver text,amount text,date text,time text)"

        );

    }
}
