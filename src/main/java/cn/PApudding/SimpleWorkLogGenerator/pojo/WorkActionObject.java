package cn.PApudding.SimpleWorkLogGenerator.pojo;

/**
 * 工作日志对象
 */
public class WorkActionObject {
    private int WorkActionObjectId;
    private String WorkWorkActionObject;

    public WorkActionObject() {
    }

    public WorkActionObject(int workActionObjectId, String workWorkActionObject) {
        WorkActionObjectId = workActionObjectId;
        WorkWorkActionObject = workWorkActionObject;
    }

    public int getWorkActionObjectId() {
        return WorkActionObjectId;
    }

    public void setWorkActionObjectId(int workActionObjectId) {
        WorkActionObjectId = workActionObjectId;
    }

    public String getWorkWorkActionObject() {
        return WorkWorkActionObject;
    }

    public void setWorkWorkActionObject(String workWorkActionObject) {
        WorkWorkActionObject = workWorkActionObject;
    }
}
