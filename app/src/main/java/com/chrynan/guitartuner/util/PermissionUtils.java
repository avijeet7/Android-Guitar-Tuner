package com.chrynan.guitartuner.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/*
 * Copyright 2016 chRyNaN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by chRyNaN on 1/20/2016.
 */
public class PermissionUtils {

    public static boolean hasPermission(Context context, String permission){
        int permissionCheck = ContextCompat.checkSelfPermission(context, permission);
        if(permissionCheck == PackageManager.PERMISSION_GRANTED){
            return true;
        }
        return false;
    }

    public static void requestPermissions(Activity activity, String[] permissions, int requestCode){
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }

}
