package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import cn.PApudding.SimpleWorkLogGenerator.service.WorkLogSelectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*",maxAge = 3000)
@RequestMapping("/workLogSelects")
public class WorkLogSelectsController {
    @Autowired
    private WorkLogSelectsService workLogSelectsService;

    /**
     * 更新workActionObject
     * @param workActionObject
     * @return
     */
    @RequestMapping(value = "/workActionObject",method = RequestMethod.PUT)
    boolean putWorkActionObject(@RequestBody WorkActionObject workActionObject){
        try{
            return workLogSelectsService.updateWorkActionObject(workActionObject);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 插入workActionObject
     * @param workActionObject
     * @return
     */
    @RequestMapping(value = "/workActionObject",method = RequestMethod.POST)
    boolean postWorkActionObject(@RequestBody WorkActionObject workActionObject){
        try{
            return workLogSelectsService.insertWorkActionObject(workActionObject);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 删除workActionObject
     * @param workActionObjectId
     * @return
     */
    @RequestMapping(value = "/workActionObject/{workActionObjectId}",method = RequestMethod.DELETE)
    boolean deleteWorkActionObject(@PathVariable String workActionObjectId){
        try{
            return workLogSelectsService.deleteWorkActionObject(workActionObjectId);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 更新workActionType
     * @param workActionType
     * @return
     */
    @RequestMapping(value = "/workActionType",method = RequestMethod.PUT)
    boolean putWorkActionType(@RequestBody WorkActionType workActionType){
        try{
            return workLogSelectsService.updateWorkActionType(workActionType);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 插入workActionType
     * @param workActionType
     * @return
     */
    @RequestMapping(value = "/workActionType",method = RequestMethod.POST)
    boolean postWorkActionType(@RequestBody WorkActionType workActionType){
        try{
            return workLogSelectsService.insertWorkActionType(workActionType);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 删除workActionType
     * @param workActionTypeId
     * @return
     */
    @RequestMapping(value = "/workActionType/{workActionTypeId}",method = RequestMethod.DELETE)
    boolean deleteWorkActionType(@PathVariable String workActionTypeId){
        try{
            return workLogSelectsService.deleteWorkActionType(workActionTypeId);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 更新workType
     * @param workType
     * @return
     */
    @RequestMapping(value = "/workType",method = RequestMethod.PUT)
    boolean putWorkType(@RequestBody WorkType workType){
        try{
            return workLogSelectsService.updateWorkType(workType);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 插入workType
     * @param workType
     * @return
     */
    @RequestMapping(value = "/workType",method = RequestMethod.POST)
    boolean postWorkType(@RequestBody WorkType workType){
        try{
            return  workLogSelectsService.insertWorkType(workType);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 删除workType
     * @param workTypeId
     * @return
     */
    @RequestMapping(value = "/workType/{workTypeId}",method = RequestMethod.DELETE)
    boolean deleteWorkType(@PathVariable String workTypeId){
        try{
            return workLogSelectsService.deleteWorkType(workTypeId);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 更新workUnit
     * @param workUnit
     * @return
     */
    @RequestMapping(value = "/workUnit",method = RequestMethod.PUT)
    boolean putWorkUnit(@RequestBody WorkUnit workUnit){
        try{
            return workLogSelectsService.updateWorkUnit(workUnit);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 插入workUnit
     * @param workUnit
     * @return
     */
    @RequestMapping(value = "/workUnit",method = RequestMethod.POST)
    boolean postWorkUnit(@RequestBody WorkUnit workUnit){
        try{
            return workLogSelectsService.insertWorkUnit(workUnit);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 删除workUnit
     * @param workUnitId
     * @return
     */
    @RequestMapping(value = "/workUnit/{workUnitId}",method = RequestMethod.DELETE)
    boolean deleteWorkUnit(@PathVariable String workUnitId){
        try{
            return workLogSelectsService.deleteWorkUnit(workUnitId);
        }catch (Exception e){
            return false;
        }
    }
}
