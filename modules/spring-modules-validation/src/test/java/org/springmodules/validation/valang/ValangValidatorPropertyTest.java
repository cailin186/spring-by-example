/*
 * Copyright 2004-2009 the original author or authors.
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

package org.springmodules.validation.valang;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.Validator;

/**
 * <code>ValangValidator</code> property test.
 * 
 * @author David Winterfeldt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ValangValidatorPropertyTest {

	final Logger logger = LoggerFactory.getLogger(ValangValidatorPropertyTest.class);
	
	@Autowired
	private Validator validator = null;
	
	@Autowired
	private Map<String, Object> hVars = null;

    @Autowired
    private List<Object> lVars = null;

	/**
	 * Test passing validation.
	 */
	@Test
	public void testValidValidation() {
		assertNotNull("Validator is null.", validator);

		BeanWrapper bean = new BeanWrapper();
		bean.setMapVars(hVars);
		bean.setListVars(lVars);
		bean.setVars(lVars.toArray());
		
		Errors errors = new MapBindingResult(new HashMap(), "person");

		validator.validate(bean, errors);
		
		assertTrue("Should not have any errors.", !errors.hasErrors());
	}

}
