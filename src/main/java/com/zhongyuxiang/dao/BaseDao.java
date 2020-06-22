package com.zhongyuxiang.dao;


import com.zhongyuxiang.utils.DBUtil;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @auth zhongyuxiang
 * @date 2020/6/22
 * @Description
 */
public class BaseDao {

    public JdbcTemplate template = new JdbcTemplate(DBUtil.getDataSource());

}
