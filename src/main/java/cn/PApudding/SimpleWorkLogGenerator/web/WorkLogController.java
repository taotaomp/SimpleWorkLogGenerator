package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class WorkLogController {
    @Autowired
    private WorkLogService workLogService;

    @RequestMapping(value = "/workLog",method = RequestMethod.POST)
    public Object postWorkLog(@RequestBody WorkLog workLog){
        //JSONPObject jsonpObject = new JSONPObject();
        return workLogService.postWorkLog(workLog);
    }
}
