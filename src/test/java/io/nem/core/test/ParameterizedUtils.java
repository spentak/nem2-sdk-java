/*
 * Copyright 2018 NEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nem.core.test;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Static helper class for writing parameterized tests.
 */
public class ParameterizedUtils {

    /**
     * Wraps a collection of integers into a collection of object arrays that can be used in
     * parameterized tests.
     *
     * @param values The collection of integers.
     * @return The collection of object arrays.
     */
    public static Collection<Object[]> wrap(final Collection<Integer> values) {
        return values.stream()
                .map(v -> new Object[]{v})
                .collect(Collectors.toList());
    }
}
