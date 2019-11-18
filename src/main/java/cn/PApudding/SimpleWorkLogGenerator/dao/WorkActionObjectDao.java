package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkActionObjectDao {
    @Select("SELECT * FROM WorkActionObject")
    List<WorkActionObject> findAll();
}
