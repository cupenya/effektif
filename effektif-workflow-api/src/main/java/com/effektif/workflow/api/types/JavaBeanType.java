/*
 * Copyright 2014 Effektif GmbH.
 *
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
package com.effektif.workflow.api.types;

import com.fasterxml.jackson.annotation.JsonTypeName;


/** 
 * represents a json object type that internally is parsed to a java bean. 
 * 
 * @author Tom Baeyens
 */
@JsonTypeName("javaBean")
public class JavaBeanType extends Type {

  protected Class<?> javaClass;
  
  public JavaBeanType() {
  }
  
  public JavaBeanType(Class javaClass) {
    javaClass(javaClass);
  }

  public Class<?> getJavaClass() {
    return this.javaClass;
  }
  public void setJavaClass(Class<?> javaClass) {
    this.javaClass = javaClass;
  }
  public JavaBeanType javaClass(Class<?> javaClass) {
    this.javaClass = javaClass;
    return this;
  }

}
