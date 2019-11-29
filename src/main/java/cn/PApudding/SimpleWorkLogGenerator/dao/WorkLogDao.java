package cn.PApudding.SimpleWorkLogGenerator.dao;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import cn.PApudding.SimpleWorkLogGenerator.vo.WorkLogVo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkLogDao {
    @Insert("INSERT INTO WorkLog(currentDate,workTypeId,startTime,finishTime,workUnitId,workLogItems) VALUES (#{currentDate},#{workType.workTypeId},#{startTime},#{finishTime},#{workUnit.workUnitId},#{workLogItems});")
    boolean addWorkLog(WorkLog workLog);


    @Select("SELECT wl.workLogId,wl.currentDate,wt.workTypeId,wt.workTypeName,wl.startTime,wl.finishTime,wu.workUnitId,wu.workUnitName,workLogItems  FROM WorkLog wl,WorkUnit wu,WorkType wt where wl.workUnitId = wu.workUnitId AND wl.workTypeId = wt.workTypeId")
    List<WorkLogVo> findAll();

    @Select("SELECT wl.workLogId,wl.currentDate,wt.workTypeId,wt.workTypeName,wl.startTime,wl.finishTime,wu.workUnitId,wu.workUnitName,workLogItems  FROM WorkLog wl,WorkUnit wu,WorkType wt where wl.workUnitId = wu.workUnitId AND wl.workTypeId = wt.workTypeId AND currentDate=#{currentDate}")
    List<WorkLogVo> findByCurrentDate(String currentDate);
}
