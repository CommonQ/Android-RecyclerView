# RecyclerView and CardView
Demo for using RecylcerView and CardView with Android L new features.

##Prerequisites
 - android-support-v7
 - Recyclerview
 - Cardview

## Download

Sample app link on its way.
In your build.gradle

```groovy

dependencies {
    compile  fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:21.0.0'
    compile 'com.android.support:recyclerview-v7:21.+'
    compile 'com.android.support:cardview-v7:21.+'
}
```

## Usage
####RecyclerView
```
   <android.support.v7.widget.RecyclerView
        android:id="@+id/list"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_below="@id/toolbar"
        tools:context=".DemoActivity"
        />
```


####CardView
```
<android.support.v7.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal" android:layout_width="match_parent"
    xmlns:card_view="http://schemas.android.com/apk/res-auto"
    android:layout_margin="5dp"
    card_view:cardCornerRadius="10dp"
    android:layout_height="match_parent">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <ImageView
            android:id="@+id/spotImage"
            android:layout_width="match_parent"
            android:layout_height="100dp"
            android:scaleType="centerCrop"
            android:tint="@color/photo_tint"
            android:layout_centerInParent="true"
            />

        <TextView
            android:id="@+id/spotName"
            android:gravity="center"
            android:background="?android:selectableItemBackground"
            android:focusable="true"
            android:clickable="true"
            android:layout_width="match_parent"
            android:layout_height="100dp"
            android:textSize="24sp"
            android:layout_centerInParent="true"
            android:textColor="@android:color/white"
            />

    </RelativeLayout>

</android.support.v7.widget.CardView>
```


#License
	Copyright (C) 2014 CommonQ 

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

