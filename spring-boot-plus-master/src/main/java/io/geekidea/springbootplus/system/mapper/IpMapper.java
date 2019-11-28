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

package io.geekidea.springbootplus.system.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.system.entity.Ip;
import io.geekidea.springbootplus.system.param.IpQueryParam;
import io.geekidea.springbootplus.system.vo.IpQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 * IP地址 Mapper 接口
 * </p>
 *
 * @author geekidea
 * @since 2019-10-11
 */
@Repository
public interface IpMapper extends BaseMapper<Ip> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    IpQueryVo getIpById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param ipQueryParam
     * @return
     */
    IPage<IpQueryVo> getIpPageList(@Param("page") Page page, @Param("param") IpQueryParam ipQueryParam);

}
