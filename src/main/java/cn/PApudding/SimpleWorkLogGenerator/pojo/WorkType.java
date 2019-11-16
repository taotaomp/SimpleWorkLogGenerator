package cn.PApudding.SimpleWorkLogGenerator.pojo;

import java.util.List;

/**
 * 工作类型
 */
public class WorkType {
    private int workTypeId;
    private String workTypeName;
    private List<WorkActionType> workActionTypeList;

    public WorkType() {
    }

    public WorkType(int workTypeId, String workTypeName) {
        this.workTypeId = workTypeId;
        this.workTypeName = workTypeName;
    }

    public int getWorkTypeId() {
        return workTypeId;
    }

    public void setWorkTypeId(int workTypeId) {
        this.workTypeId = workTypeId;
    }

    public String getWorkTypeName() {
        return workTypeName;
    }

    public void setWorkTypeName(String workTypeName) {
        this.workTypeName = workTypeName;
    }

    public List<WorkActionType> getWorkActionTypeList() {
        return workActionTypeList;
    }

    public void setWorkActionTypeList(List<WorkActionType> workActionTypeList) {
        this.workActionTypeList = workActionTypeList;
    }
}
