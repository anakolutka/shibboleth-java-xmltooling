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

package org.opensaml.xml.security;

import org.opensaml.xml.signature.KeyInfo;

/**
 * Evaluates the trustworthiness and validity of an entity's credential against implementation-specific requirements.
 * 
 * @param <CredentialType> entity credential types this trust engine evaluates
 * @param <KeyInfoResolverType> resolver used to extract keying information from {@link KeyInfo}.
 */
public interface EntityCredentialTrustEngine<CredentialType extends EntityCredential, KeyInfoResolverType extends KeyInfoResolver>
        extends TrustEngine<CredentialType, KeyInfoResolverType> {

}