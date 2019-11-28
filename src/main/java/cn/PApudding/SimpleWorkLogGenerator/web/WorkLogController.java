package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(value = "*",maxAge = 3000)
public class WorkLogController {
    @Autowired
    private WorkLogService workLogService;

    @RequestMapping(value = "/workLog",method = RequestMethod.POST)
    public Object postWorkLog(@RequestBody WorkLog workLog){
        return workLogService.postWorkLog(workLog);
    }

    @RequestMapping(value = "/workLogs",method = RequestMethod.GET)
    public Object listWorkLog(){
        return workLogService.listWorkLog();
    }
}
