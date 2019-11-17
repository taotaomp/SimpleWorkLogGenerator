package cn.PApudding.SimpleWorkLogGenerator.service.impl;

import cn.PApudding.SimpleWorkLogGenerator.dao.WorkTypeDao;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
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
}
