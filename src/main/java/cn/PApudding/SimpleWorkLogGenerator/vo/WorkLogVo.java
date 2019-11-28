package cn.PApudding.SimpleWorkLogGenerator.vo;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;
import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkLogVo implements Serializable {
    private int workLogId;
    private String currentDate;
    private String workTypeName;
    private String startTime;
    private String finishTime;
    private String workUnitName;
    private String workLogItems;


}
