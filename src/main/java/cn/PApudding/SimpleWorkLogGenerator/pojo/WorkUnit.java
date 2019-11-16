package cn.PApudding.SimpleWorkLogGenerator.pojo;

/**
 * 工作单元
 */
public class WorkUnit {
    private int workUnitId;
    private String workUnitName;

    public WorkUnit() {
    }

    public WorkUnit(int workUnitId, String workUnitName) {
        this.workUnitId = workUnitId;
        this.workUnitName = workUnitName;
    }

    public int getWorkUnitId() {
        return workUnitId;
    }

    public void setWorkUnitId(int workUnitId) {
        this.workUnitId = workUnitId;
    }

    public String getWorkUnitName() {
        return workUnitName;
    }

    public void setWorkUnitName(String workUnitName) {
        this.workUnitName = workUnitName;
    }
}
