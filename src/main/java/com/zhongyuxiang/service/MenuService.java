package com.zhongyuxiang.service;


import com.zhongyuxiang.dao.MenuDao;
import com.zhongyuxiang.entity.Menu;

import java.util.List;

/**
 * @auth zhongyuxiang
 * @date 2020/6/22
 * @Description
 */
public class MenuService {

    private MenuDao menuDao = new MenuDao();

    public List<Menu> listAll() {
        return menuDao.listAll();
    }
}
