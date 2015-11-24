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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chathu
 */
public class BrainiacTest {
    
    public BrainiacTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDropBoxPath method, of class Brainiac.
     */
    @Test
    public void testGetDropBoxPath() throws Exception {
        System.out.println("getDropBoxPath");
        String expResult = "C:\\Dropbox"; // Your Dropbox folder location
        String result = Brainiac.getDropBoxPath();
        assertEquals(expResult, result);
    }
    
}
