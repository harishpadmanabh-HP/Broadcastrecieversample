package com.example.user.broadcastrecieversample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class broadcastclass extends BroadcastReceiver {

    String num;

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub


        Bundle bun = intent.getExtras();
        if (bun != null) {

            String state = bun.getString(TelephonyManager.EXTRA_STATE);
            Log.e("Extra ......state", state);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                num = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Toast.makeText(context, "our app" + num, Toast.LENGTH_LONG).show();
                Log.e("numberbbbbbbbbbbbbbbbbb", num);
            }
        }


//        try {
//            // TELEPHONY MANAGER class object to register one listner
//            TelephonyManager tmgr = (TelephonyManager) context
//                    .getSystemService(Context.TELEPHONY_SERVICE);
//
//            //Create Listner
//            MyPhoneStateListener PhoneListener = new MyPhoneStateListener();
//
//            // Register listener for LISTEN_CALL_STATE
//            tmgr.listen(PhoneListener, PhoneStateListener.LISTEN_CALL_STATE);
//
//        } catch (Exception e) {
//            Log.e("Phone Receive Error", " " + e);
//        }
//
//    }
//
//    private class MyPhoneStateListener extends PhoneStateListener {
//
//        public void onCallStateChanged(int state, String incomingNumber) {
//
//            Log.d("MyPhoneListener",state+"   incoming no:"+incomingNumber);
//
//            if (state == 1) {
//
//                String msg = "New Phone Call Event. Incomming Number : "+incomingNumber;
//                int duration = Toast.LENGTH_LONG;
//    //            Toast toast = Toast.makeText(context, msg, duration);
////                toast.show();
//                Log.e("PHONE NUMBER",incomingNumber);
//
//            }
//        }
//    }
    }
}
