package cn.PApudding.SimpleWorkLogGenerator.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AuthorityDao {
    @Update("UPDATE authority SET isAuthority = #{isAuthority} WHERE id = 1")
    Boolean setAuthorityStatus(Integer isAuthority);
    @Select("SELECT token FROM authority WHERE id = 1")
    String getToken();
    @Select("Select isAuthority FROM authority WHERE id = 1")
    int getAuthorityStatus();
}
