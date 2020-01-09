/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
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

package io.geekidea.springbootplus.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义异常
 * @author geekidea
 * @date 2018-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SpringBootPlusException extends RuntimeException{
    private Integer errorCode;
    private String message;

    public SpringBootPlusException(String message) {
        super(message);
        this.message = message;
    }

    public SpringBootPlusException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }
}
