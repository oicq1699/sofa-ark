/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.ark.container.service.biz;

import com.alipay.sofa.ark.container.BaseTest;
import com.alipay.sofa.ark.container.service.ArkServiceContainer;
import com.alipay.sofa.ark.spi.model.Biz;
import com.alipay.sofa.ark.spi.service.biz.BizFactoryService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;

/**
 * @author qilong.zql
 * @since 0.4.0
 */
public class BizFactoryServiceTest extends BaseTest {

    private BizFactoryService bizFactoryService = new BizFactoryServiceImpl();

    @Test
    public void test() throws Throwable {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        URL sampleBiz = cl.getResource("sample-biz.jar");
        Biz biz = bizFactoryService.createBiz(new File(sampleBiz.getFile()));
        Assert.assertNotNull(biz);
    }

}