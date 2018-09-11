package com.study.mvc.service;

import com.study.mvc.annotation.Service;

/**
 * @author Mtime
 * @date 2018/8/17.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String get(String name) {
        return name;
    }
}
