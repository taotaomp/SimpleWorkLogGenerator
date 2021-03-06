package cn.PApudding.SimpleWorkLogGenerator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工作日志动作类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkActionType implements Serializable {
    private int workActionTypeId;
    private String workActionTypeName;

}
