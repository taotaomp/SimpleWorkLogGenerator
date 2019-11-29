package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkLog;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService;
import cn.PApudding.SimpleWorkLogGenerator.vo.WorkLogVo;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(value = "*",maxAge = 3000)
public class WorkLogController {
    @Autowired
    private WorkLogService workLogService;

    //添加新记录
    @RequestMapping(value = "/workLog",method = RequestMethod.POST)
    public Object postWorkLog(@RequestBody WorkLog workLog){
        try{
            return workLogService.postWorkLog(workLog);
        }catch (Exception e){
            return false;
        }

    }

    //获取全部记录
    @RequestMapping(value = "/workLogs",method = RequestMethod.GET)
    public Object listWorkLog(@RequestParam(value = "callback",required = false) String callback){
        try{
            List<WorkLogVo> workLogs = workLogService.listWorkLog();
            if(callback==null){
                return workLogs;
            }
            JSONPObject jsonpObject = new JSONPObject(callback,workLogs);
            return jsonpObject;
        }catch (Exception e){
            List<WorkLogVo> workLogVos = new ArrayList<>();
            WorkLogVo workLogVo1= new WorkLogVo(-1,"未认证","未认证","未","认证","未认证","未认证");
            WorkLogVo workLogVo2= new WorkLogVo(-2,"未认证","未认证","未","认证","未认证","未认证");
            workLogVos.add(workLogVo1);
            workLogVos.add(workLogVo2);
            if(callback==null){
                return workLogVos;
            }
            return new JSONPObject(callback,workLogVos);
        }

    }

    //按日期获取记录
    @RequestMapping(value = "/workLog",method = RequestMethod.GET)
    public Object listWorkLogByCurrentDate(@RequestParam(value = "callback",required = false) String callback,
                                           @RequestParam(value = "currentDate")String currentDate){
        try {
            List<WorkLogVo> workLogs = workLogService.listWorkLogByCurrentDate(currentDate);
            if(callback==null){
                return workLogs;
            }
            JSONPObject jsonpObject = new JSONPObject(callback,workLogs);
            return jsonpObject;
        }catch (Exception e){
            List<WorkLogVo> workLogVos = new ArrayList<>();
            WorkLogVo workLogVo1= new WorkLogVo(-1,"未认证","未认证","未","认证","未认证","未认证");
            WorkLogVo workLogVo2= new WorkLogVo(-2,"未认证","未认证","未","认证","未认证","未认证");
            workLogVos.add(workLogVo1);
            workLogVos.add(workLogVo2);
            if(callback==null){
                return workLogVos;
            }
            return new JSONPObject(callback,workLogVos);
        }
    }
}
