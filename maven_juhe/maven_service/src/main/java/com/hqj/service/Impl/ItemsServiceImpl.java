package com.hqj.service.Impl;

import com.hqj.dao.ItemsDao;
import com.hqj.domain.Items;
import com.hqj.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
