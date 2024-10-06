package com.example.broadcastrecevier1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AriplanModeChangedReciver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){

            Toast.makeText(context,"Airplane is changed", Toast.LENGTH_SHORT).show()
        }

    }
}