package com.soft.yann.mapper;

import com.soft.yann.bean.Hr;
import com.soft.yann.bean.Role;

import java.util.List;

public interface HrMapper {

    Hr queryHrById(Long id);

    List<Role> queryRolesByHrId(Long id);
}
