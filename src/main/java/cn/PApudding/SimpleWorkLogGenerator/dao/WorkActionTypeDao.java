package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkActionTypeDao {
    @Select("SELECT * FROM WorkActionType")
    List<WorkActionType> findAll();
}
