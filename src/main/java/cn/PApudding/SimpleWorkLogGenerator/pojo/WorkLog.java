package cn.PApudding.SimpleWorkLogGenerator.pojo;

import java.io.Serializable;

public class WorkLog implements Serializable {
    private int workLogId;
    private String currentDate;
    private WorkType workType;
    private String startTime;
    private String finishTime;
    private WorkUnit workUnit;
    private String workLogItems;

    public WorkLog(int workLogId, String currentDate, WorkType workType, String startTime, String finishTime, WorkUnit workUnit, String workLogItems) {
        this.workLogId = workLogId;
        this.currentDate = currentDate;
        this.workType = workType;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.workUnit = workUnit;
        this.workLogItems = workLogItems;
    }

    public WorkLog() {
    }

    public int getWorkLogId() {
        return workLogId;
    }

    public void setWorkLogId(int workLogId) {
        this.workLogId = workLogId;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public WorkUnit getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(WorkUnit workUnit) {
        this.workUnit = workUnit;
    }

    public String getWorkLogItems() {
        return workLogItems;
    }

    public void setWorkLogItems(String workLogItems) {
        this.workLogItems = workLogItems;
    }
}
