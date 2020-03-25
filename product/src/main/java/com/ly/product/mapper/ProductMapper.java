package com.ly.product.mapper;

import com.ly.commom.entity.Product;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {

    @Select("SELECT * FROM APP_PRODUCT WHERE ID = #{id}")
    @Results(value = {
            @Result(column = "product_name", property = "productName"),
            @Result(column = "product_code", property = "productCode"),
            @Result(column = "main_img", property = "mainImg"),
            @Result(column = "price", property = "price"),
            @Result(column = "origin_price", property = "originPrice"),
            @Result(column = "stock_num", property = "stockNum"),
            @Result(column = "is_deleted", property = "isDeleted"),
            @Result(column = "store_id", property = "storeId"),
            @Result(column = "store_code", property = "storeCode"),
            @Result(column = "creator_id", property = "creatorId"),
            @Result(column = "creator", property = "creator"),
            @Result(column = "created_time", property = "createdTime"),
            @Result(column = "last_operator", property = "lastOperator"),
            @Result(column = "last_operator_id", property = "lastOperatorId"),
            @Result(column = "update_time", property = "updateTime"),
    })
    Product findById(Integer id);
}
