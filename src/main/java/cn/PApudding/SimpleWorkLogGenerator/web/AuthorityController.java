package cn.PApudding.SimpleWorkLogGenerator.web;

import cn.PApudding.SimpleWorkLogGenerator.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @RequestMapping(value = "/authority",method = RequestMethod.POST)
    public boolean getAuthority(@RequestBody(required = false) String token){
        if (authorityService.audit(token)){
            authorityService.setAuthorityStatus(1);
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/authority",method = RequestMethod.GET)
    public void expireAuthority(){
        authorityService.setAuthorityStatus(0);
    }
}
