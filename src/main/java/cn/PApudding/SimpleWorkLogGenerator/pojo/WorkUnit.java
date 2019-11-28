package cn.PApudding.SimpleWorkLogGenerator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工作单元
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkUnit implements Serializable {
    private int workUnitId;
    private String workUnitName;
}
