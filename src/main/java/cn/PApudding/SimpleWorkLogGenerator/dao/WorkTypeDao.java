package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkTypeDao {
    @Select("SELECT workTypeId,workTypeName FROM WorkType")
    List<WorkType> findAll();

    @Select("SELECT workTypeId,workTypeName FROM WorkType WHERE workTypeId=#{id}")
    WorkType findById(int id);

    @Insert("INSERT INTO WorkType(workTypeName) VALUES(#{workTypeName})")
    boolean insert(WorkType workType);

    @Update("UPDATE WorkType SET workTypeName = #{workTypeName} WHERE workTypeId = #{workTypeId}")
    boolean update(WorkType workType);

    @Delete("DELETE FROM WorkType WHERE workTypeId = #{workTypeId}")
    boolean delete(String workTypeId);
}
