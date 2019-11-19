package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WorkLogDao {
    @Insert("INSERT INTO WorkLog(currentDate,workTypeId,startTime,finishTime,workUnitId,workLogItems) VALUES (#{currentDate},#{workType.workTypeId},#{startTime},#{finishTime},#{workUnit.workUnitId},#{workLogItems});")
    boolean addWorkLog(WorkLog workLog);
}
