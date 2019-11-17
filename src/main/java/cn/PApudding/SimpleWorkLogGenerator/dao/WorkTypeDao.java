package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkTypeDao {
    @Select("SELECT workTypeId,workTypeName FROM WorkType")
    List<WorkType> findAll();

    @Select("SELECT workTypeId,workTypeName FROM WorkType WHERE workTypeId=#{id}")
    WorkType findById(int id);
}
