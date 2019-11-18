package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkUnitDao {
    @Select("SELECT * FROM WorkUnit")
    List<WorkUnit> findAll();
}
