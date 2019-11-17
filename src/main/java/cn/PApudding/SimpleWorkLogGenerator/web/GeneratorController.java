package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneratorController {

    @Autowired
    private GeneratorService generatorService;

    @RequestMapping(value = "/workTypes",method = RequestMethod.GET)
    public List<WorkType> workTypeList(){
        return generatorService.listWorkType();
    }

    @RequestMapping(value = "/workType/{id}",method = RequestMethod.GET)
    public WorkType getWorkType(@PathVariable Integer id){
        return generatorService.getWorkType(id);
    }
}
