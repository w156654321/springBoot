package com.example.dao;

import com.example.domain.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/10 17:58
 * 创建描述：
 *
 */
@Mapper
public interface CustomerMapper {
    public Info findAll();
}

