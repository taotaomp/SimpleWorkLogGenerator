package cn.PApudding.SimpleWorkLogGenerator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 工作类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkType implements Serializable {
    private int workTypeId;
    private String workTypeName;
//    private List<WorkActionType> workActionTypeList;


}
