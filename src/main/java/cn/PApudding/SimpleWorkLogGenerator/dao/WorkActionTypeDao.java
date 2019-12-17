package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkActionTypeDao {
    @Select("SELECT * FROM WorkActionType")
    List<WorkActionType> findAll();

    @Update("UPDATE WorkActionType SET workActionTypeName = #{workActionTypeName} WHERE workActionTypeId = #{workActionTypeId}")
    boolean update(WorkActionType workActionType);

    @Insert("INSERT INTO WorkActionType(workActionTypeName) VALUES(#{workActionTypeName})")
    boolean insert(WorkActionType workActionType);

    @Delete("DELETE FROM WorkActionType WHERE workActionTypeId = #{workActionTypeId}")
    boolean delete(String workActionTypeId);
}
