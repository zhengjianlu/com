package io.geekidea.springbootplus.system.convert;

import io.geekidea.springbootplus.system.entity.SysRole;
import io.geekidea.springbootplus.system.param.sysrole.AddSysRoleParam;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-20T11:26:55+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"
)
public class SysRoleConvertImpl implements SysRoleConvert {

    @Override
    public SysRole addSysRoleParamToSysRole(AddSysRoleParam addSysRoleParam) {
        if ( addSysRoleParam == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setRemark( addSysRoleParam.getRemark() );
        sysRole.setState( addSysRoleParam.getState() );
        sysRole.setName( addSysRoleParam.getName() );
        sysRole.setCode( addSysRoleParam.getCode() );
        sysRole.setType( addSysRoleParam.getType() );

        return sysRole;
    }
}
