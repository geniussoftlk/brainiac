/**
 * Copyright 2015 GENIUS SOFT PVT LTD, Sri Lanka
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.officialgenius.brainiac;

import com.officialgenius.brainiac.diodes.Diodable;
import com.officialgenius.brainiac.diodes.NixDiode;
import com.officialgenius.brainiac.diodes.WindowsDiode;
import java.io.IOException;
import org.apache.commons.lang3.SystemUtils;

public class Brainiac {

    /**
     * Get Dropbox path of the system
     * @return path of dropbox folder
     * @throws IOException
     */
    
    public static String getDropBoxPath() throws IOException {
        Diodable diode = null;
        if (SystemUtils.IS_OS_WINDOWS) {
            diode = new WindowsDiode();
        } else if (SystemUtils.IS_OS_LINUX || SystemUtils.IS_OS_MAC) {
            diode = new NixDiode();
        }
        return diode != null ? diode.getDropBoxPath() : null;
    }

}
