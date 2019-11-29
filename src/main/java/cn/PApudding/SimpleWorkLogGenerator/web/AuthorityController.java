package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.service.AuthorityService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*",maxAge = 3000)
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    //认证
    @RequestMapping(value = "/authority",method = RequestMethod.POST)
    public boolean getAuthority(@RequestBody String token){
        if (authorityService.audit(token)){
            authorityService.setAuthorityStatus(1);
            return true;
        }
        return false;
    }

    //废除认证
    @RequestMapping(value = "/authority",method = RequestMethod.GET)
    public Object expireAuthority(@RequestParam(required = false) String callback){
        if (callback==null){
            return authorityService.setAuthorityStatus(0);
        }
        JSONPObject jsonpObject = new JSONPObject(callback,authorityService.setAuthorityStatus(0));
        return jsonpObject;
    }

    //认证状态判断
    @RequestMapping(value = "/isAuthority",method = RequestMethod.GET)
    public Object getAuthorityStatus(@RequestParam(required = false) String callback){
        Integer integer = authorityService.getAuthorityStatus();
        if(callback==null){
            return integer;
        }
        JSONPObject jsonpObject = new JSONPObject(callback,integer);
        return jsonpObject;
    }
}
