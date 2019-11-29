package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService;
import cn.PApudding.SimpleWorkLogGenerator.vo.WorkLogVo;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public Object listWorkLog(@RequestParam(value = "callback",required = false) String callback){
        List<WorkLogVo> workLogs = workLogService.listWorkLog();
        if(callback==null){
            return workLogs;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,workLogs);
        return jsonpObject;
    }

    @RequestMapping(value = "/workLog",method = RequestMethod.GET)
    public Object listWorkLogByCurrentDate(@RequestParam(value = "callback",required = false) String callback,
                                           @RequestParam(value = "currentDate")String currentDate){
        List<WorkLogVo> workLogs = workLogService.listWorkLogByCurrentDate(currentDate);
        if(callback==null){
            return workLogs;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,workLogs);
        return jsonpObject;
    }
}
