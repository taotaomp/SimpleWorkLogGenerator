package cn.PApudding.SimpleWorkLogGenerator.service.impl;

import cn.PApudding.SimpleWorkLogGenerator.dao.WorkActionObjectDao;
import cn.PApudding.SimpleWorkLogGenerator.dao.WorkActionTypeDao;
import cn.PApudding.SimpleWorkLogGenerator.dao.WorkTypeDao;
import cn.PApudding.SimpleWorkLogGenerator.dao.WorkUnitDao;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogSelectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkLogSelectsServiceImpl implements WorkLogSelectsService {
    @Autowired
    private WorkActionObjectDao workActionObjectDao;
    @Autowired
    private WorkActionTypeDao workActionTypeDao;
    @Autowired
    private WorkTypeDao workTypeDao;
    @Autowired
    private WorkUnitDao workUnitDao;

    @Override
    public boolean updateWorkActionObject(WorkActionObject workActionObject) {
        return workActionObjectDao.update(workActionObject);
    }

    @Override
    public boolean insertWorkActionObject(WorkActionObject workActionObject) {
        return workActionObjectDao.insert(workActionObject);
    }

    @Override
    public boolean deleteWorkActionObject(String workActionObjectId) {
        return workActionObjectDao.delete(workActionObjectId);
    }

    @Override
    public boolean updateWorkActionType(WorkActionType workActionType) {
        return workActionTypeDao.update(workActionType);
    }

    @Override
    public boolean insertWorkActionType(WorkActionType workActionType) {
        return workActionTypeDao.insert(workActionType);
    }

    @Override
    public boolean deleteWorkActionType(String workActionTypeId) {
        return workActionTypeDao.delete(workActionTypeId);
    }

    @Override
    public boolean updateWorkType(WorkType workType) {
        return workTypeDao.update(workType);
    }

    @Override
    public boolean insertWorkType(WorkType workType) {
        return workTypeDao.insert(workType);
    }

    @Override
    public boolean deleteWorkType(String workTypeId) {
        return workTypeDao.delete(workTypeId);
    }

    @Override
    public boolean updateWorkUnit(WorkUnit workUnit) {
        return workUnitDao.update(workUnit);
    }

    @Override
    public boolean insertWorkUnit(WorkUnit workUnit) {
        return workUnitDao.insert(workUnit);
    }

    @Override
    public boolean deleteWorkUnit(String workUnitId) {
        return workUnitDao.delete(workUnitId);
    }
}
