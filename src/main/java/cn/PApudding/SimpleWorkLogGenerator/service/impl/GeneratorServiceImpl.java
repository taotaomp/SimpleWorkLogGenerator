package cn.PApudding.SimpleWorkLogGenerator.service.impl;

import cn.PApudding.SimpleWorkLogGenerator.dao.WorkActionObjectDao;
import cn.PApudding.SimpleWorkLogGenerator.dao.WorkActionTypeDao;
import cn.PApudding.SimpleWorkLogGenerator.dao.WorkTypeDao;
import cn.PApudding.SimpleWorkLogGenerator.dao.WorkUnitDao;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import cn.PApudding.SimpleWorkLogGenerator.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneratorServiceImpl implements GeneratorService {
    @Autowired
    private WorkTypeDao workTypeDao;

    @Override
    public List<WorkType> listWorkType() {
        return workTypeDao.findAll();
    }

    @Override
    public WorkType getWorkType(int id) {
        return workTypeDao.findById(id);
    }

    @Autowired
    private WorkUnitDao workUnitDao;

    @Override
    public List<WorkUnit> listWorkUnit(){
        return workUnitDao.findAll();
    }

    @Autowired
    private WorkActionObjectDao workActionObjectDao;

    @Override
    public List<WorkActionObject> listWorkActionObject() {
        return workActionObjectDao.findAll();
    }

    @Autowired
    private WorkActionTypeDao workActionTypeDao;

    @Override
    public List<WorkActionType> listWorkActionType() {
        return workActionTypeDao.findAll();
    }


}
