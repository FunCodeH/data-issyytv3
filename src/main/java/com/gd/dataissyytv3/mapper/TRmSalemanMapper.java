package com.gd.dataissyytv3.mapper;

import com.gd.dataissyytv3.entity.TRmSaleman;

import java.util.List;

public interface TRmSalemanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rm_saleman
     *
     * @mbggenerated
     */
    int insert(TRmSaleman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rm_saleman
     *
     * @mbggenerated
     */
    int insertSelective(TRmSaleman record);

    List<TRmSaleman> selectSaleManList();
}