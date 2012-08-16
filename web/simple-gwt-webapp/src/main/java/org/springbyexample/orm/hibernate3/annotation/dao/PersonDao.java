/*
 * Copyright 2002-2006 the original author or authors.
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

package org.springbyexample.orm.hibernate3.annotation.dao;


import java.util.Collection;

import org.springbyexample.orm.hibernate3.annotation.bean.Address;
import org.springbyexample.orm.hibernate3.annotation.bean.Person;
import org.springframework.security.annotation.Secured;


/**
 * Person DAO interface.
 * 
 * @author David Winterfeldt
 */
public interface PersonDao {

    /**
     * Find person by id.
     */
    public Person findPersonById(Integer id);

    /**
     * Find persons.
     */
    public Collection<Person> findPersons();

    /**
     * Find persons using a start index and max number of results.
     */
    public Collection<Person> findPersons(final int startIndex, final int maxResults);
    
    /**
     * Find persons by last name.
     */
    public Collection<Person> findPersonsByLastName(String lastName);

    /**
     * Saves person.
     */
    public Person save(Person person);

    /**
     * Deletes person.
     */
    @Secured ({"ROLE_ADMIN"})
    public void delete(Person person);

    /**
     * Saves address to person by adding or updating record.
     */
    public Person saveAddress(Integer id, Address address);

    /**
     * Deletes address.
     */
    @Secured ({"ROLE_ADMIN"})
    public Person deleteAddress(Integer id, Integer addressId);

}
