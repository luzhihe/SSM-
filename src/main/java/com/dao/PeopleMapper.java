package com.dao;

import com.model.People;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by hrym13 on 2018/3/27.
 */
@Repository
public interface PeopleMapper {

    /**
     * 查
     * @return
     */
    @Select("select * from people")
    List<People>findAllPeople();

}
