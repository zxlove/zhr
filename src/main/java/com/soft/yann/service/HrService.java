package com.soft.yann.service;

import com.soft.yann.bean.Hr;
import com.soft.yann.mapper.HrMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrService {

    private static final Logger LOG = LoggerFactory.getLogger(HrService.class);

    @Autowired
    private HrMapper hrMapper;

    public Hr queryHrById(Long id) {
        Hr hr = hrMapper.queryHrById(id);
        if (hr == null) {
            LOG.error(String.format("Can not find Hr by %s.", id));
        }
        return hr;
    }
}
