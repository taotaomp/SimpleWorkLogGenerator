package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkActionObjectDao {
    @Select("SELECT * FROM WorkActionObject")
    List<WorkActionObject> findAll();

    @Update("UPDATE WorkActionObject SET workActionObjectName = #{workActionObjectName} WHERE workActionObjectId = #{workActionObjectId}")
    boolean update(WorkActionObject workActionObject);

    @Insert("INSERT INTO WorkActionObject(workActionObjectName) values(#{workActionObjectName})")
    boolean insert(WorkActionObject workActionObject);

    @Delete("DELETE FROM WorkActionObject WHERE workActionObjectId = #{workActionObjectId}")
    boolean delete(String workActionObjectId);
}
