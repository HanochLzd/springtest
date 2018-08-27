package cn.soft.demo.service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Hanoch
 */
public class StuService {

    @Resource
    private Date date;

    private String name;

    private Map<String, List<Set<String>>> map;

    public StuService() {
        System.out.println("StuService 初始化！");
    }

    public StuService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, List<Set<String>>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<Set<String>>> map) {
        this.map = map;
    }
}
