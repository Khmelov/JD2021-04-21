package by.it.krukouski.jd02_06.taskC;

public class MainReport extends ReportBuilder {
    @Override
    public void buildHeadline() {
        report.setHeadline("Report Calc");
    }

    @Override
    public void startProgram() {
        report.setStartProgram("Program Start");
    }

    @Override
    public void expression() {
        report.setExpression(ConsoleRunner.scanner.toString());
    }

    @Override
    public void result() {
        report.setResult(ConsoleRunner.scanner.toString());
    }
}
