package cn.PApudding.SimpleWorkLogGenerator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工作日志对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkActionObject implements Serializable {
    private int workActionObjectId;
    private String workActionObjectName;



}
