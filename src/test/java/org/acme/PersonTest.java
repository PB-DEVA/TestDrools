
    /*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class PersonTest {
    
    @Test
    public void testPesronAge() {
        given()
               .body("{\n" +
                     "    \"name\": { priya\n" +
                     "        \"age\": 80\n" +
                     
                     
                     "}")
               .contentType(ContentType.JSON)
          .when()
               .post("/person/save")
          .then()
             .statusCode(200)
             .body("'Testing Person'", is("No"));
    }
}
    

