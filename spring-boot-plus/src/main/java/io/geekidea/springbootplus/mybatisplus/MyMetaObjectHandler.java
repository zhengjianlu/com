package io.geekidea.springbootplus.mybatisplus;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import io.geekidea.springbootplus.shiro.util.JwtTokenUtil;
import io.geekidea.springbootplus.shiro.util.JwtUtil;
import io.geekidea.springbootplus.shiro.util.LoginUtil;
import io.geekidea.springbootplus.shiro.vo.LoginSysUserRedisVo;
import io.geekidea.springbootplus.system.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private Date date= DateUtil.date();


    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("创建自动填充");
        // 获取userId
        Long userId = LoginUtil.getUserId();
        // 获取创建人Id
        this.strictInsertFill(metaObject,"createId",Long.class,userId);
        // 获取创建时间
        this.strictInsertFill(metaObject, "createTime", Date.class, date); // 起始版本 3.3.0(推荐使用)
        // 获取更新人Id
        this.strictInsertFill(metaObject,"updateId",Long.class,userId);
        // 获取更新时间
        this.strictUpdateFill(metaObject, "updateTime", Date.class, date);
        // 状态
        this.strictInsertFill(metaObject, "state", Integer.class, 1); // 起始版本 3.3.0(推荐使用)
        // 逻辑删除
        this.strictInsertFill(metaObject, "deleted", Integer.class, 0); // 起始版本 3.3.0(推荐使用)
//        this.fillStrategy(metaObject, "createTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug请升级到之后的版本如`3.3.1.8-SNAPSHOT`)
        /* 上面选其一使用,下面的已过时(注意 strictInsertFill 有多个方法,详细查看源码) */
        //this.setFieldValByName("operator", "Jerry", metaObject);
        //this.setInsertFieldValByName("operator", "Jerry", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("更新自动填充");
        // 获取userId
        Long userId = LoginUtil.getUserId();
        // 获取更新人Id
        this.strictInsertFill(metaObject,"updateId",Long.class,userId);
        // 获取更新时间
        this.strictUpdateFill(metaObject, "updateTime", Date.class, date); // 起始版本 3.3.0(推荐使用)
//        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug请升级到之后的版本如`3.3.1.8-SNAPSHOT`)
        /* 上面选其一使用,下面的已过时(注意 strictUpdateFill 有多个方法,详细查看源码) */
        //this.setFieldValByName("operator", "Tom", metaObject);
        //this.setUpdateFieldValByName("operator", "Tom", metaObject);
    }
}
