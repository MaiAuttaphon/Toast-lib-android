package com.auttamai.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by AuttaphonL. on 23,August,2022
 */

public class ToastMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
