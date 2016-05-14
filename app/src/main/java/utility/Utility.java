package utility;

import android.content.Context;

/**
 * Created by root on 5/14/16.
 */
public class Utility {

    public static final String PAYMENT_URL = "";
    public static final String PHONE_KEY = "phonenumber";
    public static final String AMOUNT_KEY =  "amount";

    private Context context;

    private Utility(Context c){
        context = c;
    }

    public static Utility getInstance(Context c){
        return new Utility(c);
    }

    //alert sweet dialog with a success message
    protected void alertSuccess(String message){
       // SweetAlertDialog sweetAlertDialog = SweetAlertDialog.
    }

    //alert sweetdialog with a warning message
    protected void alertWarning(String message){

    }
    //alert sweetdialog with a failure message
    protected void alertError(String message){

    }
}
