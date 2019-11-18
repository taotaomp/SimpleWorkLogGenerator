package cn.PApudding.SimpleWorkLogGenerator.pojo;

/**
 * 工作日志动作类型
 */
public class WorkActionType {
    private int workActionTypeId;
    private String workActionTypeName;


    public WorkActionType() {
    }

    public WorkActionType(int workActionTypeId, String workActionTypeName) {
        this.workActionTypeId = workActionTypeId;
        this.workActionTypeName = workActionTypeName;
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

}
