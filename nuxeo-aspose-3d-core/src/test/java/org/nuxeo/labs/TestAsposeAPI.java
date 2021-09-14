/*
 * (C) Copyright 2021 Nuxeo (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Michael Vachette
 */

package org.nuxeo.labs;

import com.aspose.threed.FileFormat;
import com.aspose.threed.Scene;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestAsposeAPI {

    @Test
    public void testConvertModelToGLB() throws IOException {
        com.aspose.threed.TrialException.setSuppressTrialException(true);
        Scene scene = new Scene();

        // Load an existing 3D document
        scene.open(new File(getClass().getResource("/files/test_model/MMSEV.obj").getPath()).getPath());

        // save in GLB format
        scene.save("target/Out.glb", FileFormat.GLTF2_BINARY);
    }

}
