/*
 * #%L
 * Wisdom-Framework
 * %%
 * Copyright (C) 2013 - 2014 Wisdom Framework
 * %%
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
 * #L%
 */
package com.ksenechal.wisdom.issues.issue513.platform;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.wisdom.test.http.HttpResponse;
import org.wisdom.test.parents.WisdomBlackBoxTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * A black box test checking that the Welcome page is correctly serve on "/".
 */
public class PlatformAdminIT extends WisdomBlackBoxTest {

    @Test
    /**
     * see https://github.com/wisdom-framework/wisdom/issues/513
     */
    public void testThatTheAdministrationPageIsServedWithRelativeTemplateResolution() throws Exception {
        HttpResponse<Document> page = get("/platform/admin").asHtml();
        assertThat(page.body().title()).isEqualTo("Administrator Accounts");
    }
}
