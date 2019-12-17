package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkUnitDao {
    @Select("SELECT * FROM WorkUnit")
    List<WorkUnit> findAll();

    @Update("UPDATE WorkUnit SET workUnitName = #{workUnitName} WHERE workUnitId = #{workUnitId}")
    boolean update(WorkUnit workUnit);

    @Insert("INSERT INTO WorkUnit(workUnitName) VALUES(#{workUnitName})")
    boolean insert(WorkUnit workUnit);

    @Delete("DELETE FROM WorkUnit WHERE workUnitId = #{workUnitId}")
    boolean delete(String workUnitId);
}
