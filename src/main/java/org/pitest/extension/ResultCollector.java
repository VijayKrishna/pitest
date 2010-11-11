/*
 * Copyright 2010 Henry Coles
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and limitations under the License. 
 */
package org.pitest.extension;

import org.pitest.Description;
import org.pitest.MetaData;

public interface ResultCollector {

  public void notifyEnd(Description description, Throwable t, MetaData... data);

  public void notifyEnd(Description description, MetaData... data);

  public void notifyStart(final Description description);

  public void notifySkipped(final Description description);

  public boolean shouldExit();
}
