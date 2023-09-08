package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Department {
    @Id
   @SequenceGenerator(name = "department_sequence",
   sequenceName = "department_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="department_sequence")
    private Long deaprtmentId;
    private String departmentName;
    private String departmentAddress;
    private int departmentCode;

    public long getDeaprtmentId() {
        return deaprtmentId;
    }

    public void setDeaprtmentId(Long deaprtmentId) {
        this.deaprtmentId = deaprtmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deaprtmentId=" + deaprtmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
