package by.it.krukouski.jd02_06.taskC;

class Report {
    private String headline = "";
    private String startProgramm = "";
    private String expression = "";
    private String result = "";

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setStartProgram(String startProgram) {
        this.startProgramm = startProgramm;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Report" + "headline" + headline + "\n" +
                "startProgram: " + startProgramm + "\n" +
                "expression: " + expression + "\n" +
                "result: " + result;
    }
}
