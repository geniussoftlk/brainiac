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

package com.officialgenius.brainiac.diodes;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NixDiode implements Diodable {

    private final String NIX_DROPBOX_INFO_PATH = "~/.dropbox/info.json";

    @Override
    public String getDropBoxPath() throws IOException {
        Gson gson = new Gson();
        Path pathToDropBox = Paths.get(NIX_DROPBOX_INFO_PATH.replaceFirst("^~", System.getProperty("user.home")));
        BufferedReader br = Files.newBufferedReader(pathToDropBox, Charset.forName("UTF-8"));
        JsonReader jsonReader = new JsonReader(br);
        JsonObject infoJson = gson.fromJson(jsonReader, JsonObject.class);
        return infoJson.getAsJsonObject("personal").get("path").getAsString();

    }

}
