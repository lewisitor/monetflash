package broadcastlisteners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.djlewis.monetflash.WelcomeActivity;

public class BootCompleted extends BroadcastReceiver {
    public BootCompleted() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //boot has been completed, start welcome activity
        String action = intent.getAction();
        if (action == Intent.ACTION_BOOT_COMPLETED){
            Intent mainintent = new Intent(context, WelcomeActivity.class);
            mainintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mainintent);
        }
    }
}
