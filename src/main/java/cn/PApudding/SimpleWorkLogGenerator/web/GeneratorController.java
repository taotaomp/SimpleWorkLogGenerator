package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.service.GeneratorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @RequestMapping(value = "/workTypes",method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public Object workTypeList(@RequestParam String callback) throws JsonProcessingException {
        //MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(generatorService.listWorkType());
        ObjectMapper objectMapper = new ObjectMapper();

        String temp = objectMapper.writeValueAsString(generatorService.listWorkType());
        
        return callback+"("+temp+")";

    }

    @RequestMapping(value = "/workType/{id}",method = RequestMethod.GET)
    public WorkType getWorkType(@PathVariable Integer id){
        return generatorService.getWorkType(id);
    }
}
