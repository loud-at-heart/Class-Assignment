package com.example.classassignment

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast

class ClassTask8: BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        try {
//            val state: String? = p1?.getStringExtra(TelephonyManager.EXTRA_STATE)
            val state: String? = p1?.getExtras()?.getString(TelephonyManager.EXTRA_STATE)
            if (!p1?.getExtras()?.containsKey(TelephonyManager.EXTRA_INCOMING_NUMBER)!!) {
                Log.i("Call receiver",
                    "skipping intent=" + p1.toString() + ", extras=" + p1.getExtras()
                        .toString() + " - no number was supplied"
                )
                return
            }
            val incomingNumber: String? =
                p1?.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)
            println("Receiver start")
            Toast.makeText(context, " Receiver start ", Toast.LENGTH_SHORT).show()
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                Toast.makeText(context,"Ringing State Number is -"+incomingNumber, Toast.LENGTH_SHORT).show();
            }
            if ((state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))){
                Toast.makeText(context,"Received State", Toast.LENGTH_SHORT).show();
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
                Toast.makeText(context,"Idle State", Toast.LENGTH_SHORT).show();
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}