/*
 * Copyright 2018 the original author or authors.
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

package org.gradle.api.internal.instantiation;

public interface ConstructorSelector {
    /**
     * Locates the constructor that <em>should</em> be used to create instances of the given type with the given params.
     *
     * <p>The selected constructor does not have to accept the given parameters. It is the caller's responsibility to verify that the constructor can be
     * called with the given parameters.
     *
     * <p>The selector may or may not allow null parameters. The caller should allow null parameters and delegate to the selector to make this decision.
     */
    SelectedConstructor forParams(Class<?> type, Object[] params);
}
