package cn.PApudding.SimpleWorkLogGenerator.service;

public interface AuthorityService {
    boolean setAuthorityStatus(int isAuthority);
    boolean audit(String token);
    int getAuthorityStatus();
}
