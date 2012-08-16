/*
 * Copyright 2002-2008 the original author or authors.
 *
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
 */

package org.springbyexample.web.gwt.monitor.client;

import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.ImageBundle;

/**
 * <p>Application image resource bundle.</p>
 * 
 * @author David Winterfeldt
 */
public interface ImageResourceBundle extends ImageBundle {

    /**
     * Green stop light image.
     */
    @Resource("green-light.png")
    public AbstractImagePrototype green();

    /**
     * Yellow stop light image.
     */
    @Resource("yellow-light.png")
    public AbstractImagePrototype yellow();

    /**
     * Red stop light image.
     */
    @Resource("red-light.png")
    public AbstractImagePrototype red();

    /**
     * Close image.
     */
    @Resource("close.png")
    public AbstractImagePrototype close();

}