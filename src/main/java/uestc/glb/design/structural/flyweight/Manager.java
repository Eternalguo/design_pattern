package uestc.glb.design.structural.flyweight;

public class Manager implements Employee {
    private String title = "部门经理";//内部状态，外部不能修改，不随着外部改变而改变
    private String department; // 外部状态，会随着外部状态改变而改变
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
