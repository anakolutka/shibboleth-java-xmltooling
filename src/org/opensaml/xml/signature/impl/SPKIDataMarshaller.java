/*
 * Copyright [2006] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.xml.signature.impl;

import org.opensaml.xml.signature.SPKIData;
import org.opensaml.xml.util.XMLConstants;

/**
 * A thread-safe Marshaller for {@link org.opensaml.xml.signature.SPKIData} objects.
 */
public class SPKIDataMarshaller extends AbstractXMLSignatureMarshaller {
    
    /**
     * Constructor
     *
     */
    public SPKIDataMarshaller() {
        super(XMLConstants.XMLSIG_NS, SPKIData.DEFAULT_ELEMENT_LOCAL_NAME);
    }

    /**
     * Constructor
     *
     * @param targetNamespaceURI
     * @param targetLocalName
     * @throws NullPointerException
     */
    protected SPKIDataMarshaller(String targetNamespaceURI, String targetLocalName) throws NullPointerException {
        super(targetNamespaceURI, targetLocalName);
    }

}
