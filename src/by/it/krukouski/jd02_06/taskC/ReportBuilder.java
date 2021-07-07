package by.it.krukouski.jd02_06.taskC;

abstract class ReportBuilder {
    Report report;

    public Report getReport() {
        return report;
    }

    void createNewReport(){
        report=new Report();
    }

    public abstract void buildHeadline();
    public abstract void startProgram();
    public abstract void expression();
    public abstract void result();

}
