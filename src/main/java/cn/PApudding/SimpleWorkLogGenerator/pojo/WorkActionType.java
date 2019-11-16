package cn.PApudding.SimpleWorkLogGenerator.pojo;

/**
 * 工作日志动作类型
 */
public class WorkActionType {
    private int workActionTypeId;
    private String workActionTypeName;
    private WorkActionObject workActionObject;

    public WorkActionType() {
    }

    public WorkActionType(int workActionTypeId, String workActionTypeName, WorkActionObject workActionObject) {
        this.workActionTypeId = workActionTypeId;
        this.workActionTypeName = workActionTypeName;
        this.workActionObject = workActionObject;
    }

    public int getWorkActionTypeId() {
        return workActionTypeId;
    }

    public void setWorkActionTypeId(int workActionTypeId) {
        this.workActionTypeId = workActionTypeId;
    }

    public String getWorkActionTypeName() {
        return workActionTypeName;
    }

    public void setWorkActionTypeName(String workActionTypeName) {
        this.workActionTypeName = workActionTypeName;
    }

    public WorkActionObject getWorkActionObject() {
        return workActionObject;
    }

    public void setWorkActionObject(WorkActionObject workActionObject) {
        this.workActionObject = workActionObject;
    }
}
