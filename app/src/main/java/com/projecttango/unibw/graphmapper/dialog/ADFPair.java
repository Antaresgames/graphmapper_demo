/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Note:
 * The classes of this project are based on the Java Floorplan example and there are influences from the other Java examples.
 * They can be found on https://github.com/googlesamples/tango-examples-java.
 */
package com.projecttango.unibw.graphmapper.dialog;

/**
 * <p>A simple class to connect the uuid of an ADF with its human readable name.</p>
 *
 * <p>This class was copied from the Java Area Description example.
 * This class was created by Konstantin Klinger on 07.05.16.</p>
 * @author Konstantin Klinger
 * @version 1.0
 */
public class ADFPair {
    /** Name of the ADF (human readable) */
    private String mName;
    /** Uuid of the ADF */
    private String mUuid;

    /**
     * Constructor (Creates a new Name / Uuid ADF Pair)
     * @param name (name of the ADF)
     * @param uuid (uuid of the ADF)
     */
    public ADFPair(String name, String uuid) {
        mName = name;
        mUuid = uuid;
    }

    /**
     * Getter function fot the name of the ADF
     * @return mName
     */
    public String getName() {
        return mName;
    }

    /**
     * Getter function for the UUID of the ADF
     * @return mUuid
     */
    public String getUuid() {
        return mUuid;
    }

    /**
     * Setter function for the name of the ADF.
     * @param name (human readable name of the adf)
     */
    public void setName(String name) {
        mName = name;
    }
}

