package io.github.commonq.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

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
public class ViewSpotManager {
    private static ViewSpotManager ourInstance = new ViewSpotManager();
    private static String[] SpotArray = {"Lake", "Mountain", "Forest", "Fish", "Lotus", "Sea"};
    private List<ViewSpot> spots;


    private ViewSpotManager() {
    }

    public static ViewSpotManager getInstance() {
        return ourInstance;
    }

    public List<ViewSpot> getSpots() {
        if (spots == null) {
            spots = new ArrayList<ViewSpot>();

            for (String spotName : SpotArray) {
                ViewSpot spot = new ViewSpot();
                spot.name = spotName;
                spot.imageInfo = spotName.replaceAll("\\s+", "").toLowerCase();
                spots.add(spot);
            }
        }

        return spots;
    }
}
