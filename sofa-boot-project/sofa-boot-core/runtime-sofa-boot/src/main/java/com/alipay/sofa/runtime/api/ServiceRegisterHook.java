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
package com.alipay.sofa.runtime.api;

import com.alipay.sofa.runtime.service.component.Service;
import com.alipay.sofa.runtime.spi.component.SofaRuntimeContext;
import org.springframework.core.Ordered;

/**
 * SOFA Service registering hook.
 *
 * @author <a href="mailto:guaner.zzx@alipay.com">Alaneuler</a>
 * Created on 2021/1/8
 */
public interface ServiceRegisterHook extends Ordered {
    /**
     * Hook method invoked by SOFA before the actually reference registering.
     *
     * @param service the service contract to register
     * @param sofaRuntimeContext current SOFA Runtime
     */
    void before(Service service, SofaRuntimeContext sofaRuntimeContext);

    /**
     * Hook method invoked by SOFA after the actually service registering.
     */
    void after(Service service, SofaRuntimeContext sofaRuntimeContext);
}
