package io.github.commonq.recyclerview.model;

import android.content.Context;
import android.util.Log;

/**
 * Copyright 2014 CommonQ
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Created by CommonQ on 2014/11/3.
 */
public class ViewSpot {

    public String name;
    public String imageInfo;
    public String description;
    private static final String TAG = "ViewSpot";


    public int getImageResId(Context context) {
        int id = context.getResources().getIdentifier(this.imageInfo, "drawable", context.getPackageName());
        Log.v(TAG, "--id:" + id + " imageinfo:" + this.imageInfo + " packagename:" +context.getPackageName());
        return id;
    }
}
