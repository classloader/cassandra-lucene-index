/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.builder.index.schema.mapping;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A {@link Mapper} to map a time duration.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class DurationMapper extends SingleColumnMapper<DurationMapper> {

    @JsonProperty("nanoseconds_in_day")
    Long nanosInDay;

    @JsonProperty("nanoseconds_in_month")
    Long nanosInMonth;

    /**
     * Sets the number of nanoseconds in a day.
     *
     * @param nanosInDay the number of nanoseconds in a day
     * @return this
     */
    public DurationMapper nanosInDay(Long nanosInDay) {
        this.nanosInDay = nanosInDay;
        return this;
    }

    /**
     * Sets the number of nanoseconds in a month.
     *
     * @param nanosInMonth the number of nanoseconds in a month
     * @return this
     */
    public DurationMapper nanosInMonth(Long nanosInMonth) {
        this.nanosInMonth = nanosInMonth;
        return this;
    }

}