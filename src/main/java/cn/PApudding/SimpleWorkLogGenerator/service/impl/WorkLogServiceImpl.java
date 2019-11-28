package cn.PApudding.SimpleWorkLogGenerator.service.impl;

import cn.PApudding.SimpleWorkLogGenerator.dao.WorkLogDao;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService;
import cn.PApudding.SimpleWorkLogGenerator.vo.WorkLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class WorkLogServiceImpl implements WorkLogService {
    @Autowired
    private WorkLogDao workLogDao;

    @Override
    public boolean postWorkLog(WorkLog workLog) {
        return workLogDao.addWorkLog(workLog);
    }

    @Override
    public List<WorkLogVo> listWorkLog() {
        return workLogDao.findAll();
    }
}
