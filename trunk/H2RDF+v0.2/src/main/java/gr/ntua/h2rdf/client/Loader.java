/*******************************************************************************
 * Copyright 2014 Nikolaos Papailiou
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package gr.ntua.h2rdf.client;

import gr.ntua.h2rdf.bytes.NotSupportedDatatypeException;

import com.hp.hpl.jena.graph.Triple;

public interface Loader {
	
	public void add(Triple triple) throws NotSupportedDatatypeException;
	public void close();
	public void delete(Triple triple) throws NotSupportedDatatypeException;
}
