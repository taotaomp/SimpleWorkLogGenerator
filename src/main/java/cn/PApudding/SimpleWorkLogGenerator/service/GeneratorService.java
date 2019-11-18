package cn.PApudding.SimpleWorkLogGenerator.service;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;

import java.util.List;

public interface GeneratorService {
    List<WorkType> listWorkType();
    WorkType getWorkType(int id);

    List<WorkUnit> listWorkUnit();

    List<WorkActionObject> listWorkActionObject();

    List<WorkActionType> listWorkActionType();
}
