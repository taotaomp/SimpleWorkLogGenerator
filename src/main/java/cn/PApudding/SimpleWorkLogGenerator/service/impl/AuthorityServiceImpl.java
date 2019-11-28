package cn.PApudding.SimpleWorkLogGenerator.service.impl;

import cn.PApudding.SimpleWorkLogGenerator.dao.AuthorityDao;
import cn.PApudding.SimpleWorkLogGenerator.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public boolean setAuthorityStatus(int isAuthority) {
        return false;
    }

    @Override
    public boolean audit(String token) {
        if(token.trim().equals(authorityDao.getToken().trim())){
            return true;
        }
        return false;
    }
}
