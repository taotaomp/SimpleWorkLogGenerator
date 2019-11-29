package cn.PApudding.SimpleWorkLogGenerator.aspect;

import cn.PApudding.SimpleWorkLogGenerator.dao.AuthorityDao;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorityAspect {
    @Autowired
    private AuthorityDao authorityDao;

    @Pointcut("execution(* cn.PApudding.SimpleWorkLogGenerator.service.WorkLogService.*(..))")
    private void workLogService(){}

    @Before("workLogService()")
    public void authorityCheck(){
        if(authorityDao.getAuthorityStatus()==0){
            throw new RuntimeException("未授权的访问");
        }
    }
}
