package cn.PApudding.SimpleWorkLogGenerator.service;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;

import java.util.List;

/**
 * 生成服务
 */
public interface GeneratorService {
    /**
     * 获取全部工作类型
     * @return
     */
    List<WorkType> listWorkType();

    /**
     * 按ID获取工作类型
     * @param id
     * @return
     */
    WorkType getWorkType(int id);

    /**
     * 获取全部工作单元
     * @return
     */
    List<WorkUnit> listWorkUnit();

    /**
     * 获取全部工作记录对象
     * @return
     */
    List<WorkActionObject> listWorkActionObject();

    /**
     * 获取全部工作记录类型
     * @return
     */
    List<WorkActionType> listWorkActionType();
}
