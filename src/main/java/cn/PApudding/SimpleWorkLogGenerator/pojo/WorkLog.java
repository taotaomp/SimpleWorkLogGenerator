package cn.PApudding.SimpleWorkLogGenerator.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WorkLog implements Serializable {
    private int workLogId;
    private String currentDate;
    private WorkType workType;
    private String startTime;
    private String finishTime;
    private WorkUnit workUnit;
    private String workLogItems;


}