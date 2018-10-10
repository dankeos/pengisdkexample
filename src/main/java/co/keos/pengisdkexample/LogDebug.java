package co.keos.pengisdkexample;

import android.util.Log;

public class LogDebug {
    private static final String TAG="SUPER_AWESOME_APP";

    public static void printDebug(String message){
        Log.d(TAG,message);
    }
}
