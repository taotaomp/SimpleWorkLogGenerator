package cn.PApudding.SimpleWorkLogGenerator.service;

/**
 * 授权服务
 */
public interface AuthorityService {
    boolean setAuthorityStatus(int isAuthority);
    boolean audit(String token);
    int getAuthorityStatus();
}
