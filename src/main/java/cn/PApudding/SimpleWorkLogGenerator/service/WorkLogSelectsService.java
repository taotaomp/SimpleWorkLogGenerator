package cn.PApudding.SimpleWorkLogGenerator.service;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;

/**
 * 工作日志选项服务
 */
public interface WorkLogSelectsService {
    boolean updateWorkActionObject(WorkActionObject workActionObject);
    boolean insertWorkActionObject(WorkActionObject workActionObject);
    boolean deleteWorkActionObject(String workActionObjectId);

    boolean updateWorkActionType(WorkActionType workActionType);
    boolean insertWorkActionType(WorkActionType workActionType);
    boolean deleteWorkActionType(String workActionTypeId);

    boolean updateWorkType(WorkType workType);
    boolean insertWorkType(WorkType workType);
    boolean deleteWorkType(String workTypeId);

    boolean updateWorkUnit(WorkUnit workUnit);
    boolean insertWorkUnit(WorkUnit workUnit);
    boolean deleteWorkUnit(String workUnitId);
}
