package cn.PApudding.SimpleWorkLogGenerator.service;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.vo.WorkLogVo;

import java.util.List;

/**
 * 工作日志服务
 */
public interface WorkLogService {
    boolean postWorkLog(WorkLog workLog);
    List<WorkLogVo> listWorkLog();
}
