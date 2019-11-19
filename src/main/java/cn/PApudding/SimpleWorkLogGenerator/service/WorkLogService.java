package cn.PApudding.SimpleWorkLogGenerator.service;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;

/**
 * 日志服务
 */
public interface WorkLogService {
    boolean postWorkLog(WorkLog workLog);
}
