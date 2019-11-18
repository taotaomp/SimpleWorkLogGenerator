package cn.PApudding.SimpleWorkLogGenerator.pojo;

/**
 * 工作日志对象
 */
public class WorkActionObject {
    private int workActionObjectId;
    private String workActionObjectName;

    public WorkActionObject() {
    }

    public WorkActionObject(int workActionObjectId, String workActionObjectName) {
        this.workActionObjectId = workActionObjectId;
        this.workActionObjectName = workActionObjectName;
    }

    public String getWorkActionObjectName() {
        return workActionObjectName;
    }

    public void setWorkActionObjectName(String workActionObjectName) {
        this.workActionObjectName = workActionObjectName;
    }

    public int getWorkActionObjectId() {
        return workActionObjectId;
    }

    public void setWorkActionObjectId(int workActionObjectId) {
        this.workActionObjectId = workActionObjectId;
    }


}
