package by.it.krukouski.jd02_06.taskC;

public class WriterReport {
    private ReportBuilder reportBuilder;

    public void setReportBuilder(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public Report getReportBuilder() {
        return reportBuilder.getReport();
    }

    void constructReport(){
        reportBuilder.createNewReport();
        reportBuilder.buildHeadline();
        reportBuilder.startProgram();
        reportBuilder.expression();
        reportBuilder.result();
    }
}
