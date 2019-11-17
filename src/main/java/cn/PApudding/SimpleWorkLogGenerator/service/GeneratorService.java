package cn.PApudding.SimpleWorkLogGenerator.service;

import cn.PApudding.SimpleWorkLogGenerator.pojo.WorkType;

import java.util.List;

public interface GeneratorService {
    List<WorkType> listWorkType();
    WorkType getWorkType(int id);
}
