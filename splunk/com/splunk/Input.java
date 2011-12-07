/*
 * Copyright 2011 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

/**
 * Representation of Input. This class is the base class of all typed input
 * sub-classes, as well as used in the case where we do not recognize an
 * input kind.
 */
public class Input extends Entity {

    /**
     * Class constructor.
     *
     * @param service The connected service instance.
     * @param path The Input endpoint.
     */
    Input(Service service, String path) {
        super(service, path);
    }

    /**
     * Returns unknown input kind. Overridden in sub-classes.
     *
     * @return Unknown input kind.
     */
    public InputKind getKind() {
        return InputKind.Unknown;
    }
}
