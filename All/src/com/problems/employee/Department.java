package src.com.problems.employee;
// Department interface
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// HRDepartment class implementing Department interface
class HRDepartment implements Department {
    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

// ITDepartment class implementing Department interface
class ITDepartment implements Department {
    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
