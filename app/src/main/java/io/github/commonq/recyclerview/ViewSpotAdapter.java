package io.github.commonq.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import io.github.commonq.recyclerview.model.ViewSpot;

/**
 * Copyright 2014 CommonQ
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Created by CommonQ on 2014/11/3.
 */
public class ViewSpotAdapter extends RecyclerView.Adapter<ViewSpotAdapter.ViewHolder>{

    private List<ViewSpot> spots;
    private int rowLayout;
    private Context mContext;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout,viewGroup,false);
        ViewHolder holder=new ViewHolder(v);
        return holder;
    }

    public ViewSpotAdapter(List<ViewSpot> spots, int rowLayout,
                           Context context) {
        this.spots = spots;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewSpot spot = spots.get(i);
        viewHolder.spotName.setText(spot.name);
        viewHolder.spotImage.setImageDrawable(mContext.getResources()
                .getDrawable(spot.getImageResId(mContext)));
    }

    @Override
    public int getItemCount() {
        return spots==null?0:spots.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView spotName;
        public ImageView spotImage;

        public ViewHolder(View itemView) {
            super(itemView);
            spotName = (TextView) itemView.findViewById(R.id.spotName);
            spotImage = (ImageView) itemView.findViewById(R.id.spotImage);
        }

    }
}
