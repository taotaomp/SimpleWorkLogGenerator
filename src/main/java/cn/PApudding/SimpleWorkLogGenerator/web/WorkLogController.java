package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(value = "*",maxAge = 3000)
public class WorkLogController {
    @Autowired
    private WorkLogService workLogService;

    @RequestMapping(value = "/workLog",method = RequestMethod.POST)
    public Object postWorkLog(@RequestBody WorkLog workLog , HttpServletResponse response){
        return workLogService.postWorkLog(workLog);
    }
}
