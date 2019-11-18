package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionObject;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkActionType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import cn.PApudding.SimpleWorkLogGenerator.service.GeneratorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

@RestController
@CrossOrigin
public class GeneratorController {

    @Autowired
    private GeneratorService generatorService;

    /**
     * 获取全部的WorkType
     * @param callback json跨域问题的解决方案，设置返回方法名
     * @return json对象
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/workTypes",method = RequestMethod.GET/*, produces = "text/html;charset=UTF-8"*/)
    public Object workTypeList(@RequestParam(value = "callback",required = false) String callback) throws JsonProcessingException {
        List<WorkType> workTypes = generatorService.listWorkType();
        if (callback==null){
            return workTypes;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,workTypes);
        return jsonpObject;

//        ObjectMapper objectMapper = new ObjectMapper();
//        String temp = objectMapper.writeValueAsString(generatorService.listWorkType());
//        return callback+"("+temp+")";
    }

    @RequestMapping(value = "/workType/{id}",method = RequestMethod.GET)
    public WorkType getWorkType(@PathVariable Integer id){
        return generatorService.getWorkType(id);
    }

    @RequestMapping(value = "/workUnits",method = RequestMethod.GET)
    public Object workUnitList(@RequestParam(value = "callback",required = false)String callback){
        List<WorkUnit> workUnits = generatorService.listWorkUnit();
        if (callback==null){
            return workUnits;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,workUnits);
        return jsonpObject;
    }

    @RequestMapping(value = "/workActionObjects",method = RequestMethod.GET)
    public Object workActionObjectList(@RequestParam(value = "callback",required = false) String callback){
        List<WorkActionObject> workActionObjects = generatorService.listWorkActionObject();
        if (callback==null){
            return workActionObjects;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,workActionObjects);
        return jsonpObject;
    }

    @RequestMapping(value = "/workActionTypes",method = RequestMethod.GET)
    public Object workActionTypeList(@RequestParam(value = "callback",required = false) String callback){
        List<WorkActionType> workActionTypes = generatorService.listWorkActionType();
        if (callback==null){
            return workActionTypes;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,workActionTypes);
        return jsonpObject;
    }
}
