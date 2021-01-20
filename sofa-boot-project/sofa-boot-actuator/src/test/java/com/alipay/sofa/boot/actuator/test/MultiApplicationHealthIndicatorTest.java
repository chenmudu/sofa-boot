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
package com.alipay.sofa.boot.actuator.test;

import com.alipay.sofa.boot.actuator.health.MultiApplicationHealthIndicator;
import com.alipay.sofa.runtime.SofaFramework;
import com.alipay.sofa.runtime.component.impl.ComponentManagerImpl;
import com.alipay.sofa.runtime.component.impl.StandardSofaRuntimeManager;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.actuate.health.Status;

/**
 * @author <a href="mailto:guaner.zzx@alipay.com">Alaneuler</a>
 * Created on 2020/9/8
 */
public class MultiApplicationHealthIndicatorTest {
    @Test
    public void testUp() {
        SofaFramework.registerSofaRuntimeManager(new StandardSofaRuntimeManager(Thread
            .currentThread().getContextClassLoader(), null, new ComponentManagerImpl(null)));
        Assert.assertEquals(Status.UP, new MultiApplicationHealthIndicator().health().getStatus());
    }
}
