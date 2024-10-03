
import java.util.ArrayList;
import java.util.List;

abstract class Project{
    private String projectName;
    private String deadLine;
    private int teamSize;
    private double budget;

    abstract public double calculateCost();
    abstract public void getProjectDetails();

    public String getName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
class InternalProject extends Project{
    @Override
    public double calculateCost() {
        double InPrCo = 12000;
        System.out.println("Internal Project Cost will be : "+InPrCo);
        return InPrCo;
    }
    @Override
    public void getProjectDetails() {
        System.out.println("Internal Project Name :"+ getName());
    }
}

class ClientProject extends Project{
    @Override
    public double calculateCost() {
        double ClPrCo = 120000;
        System.out.println("Client Project Cost will be :"+ ClPrCo);
        return ClPrCo;
    }
    @Override
    public void getProjectDetails() {
        System.out.println("Client Project :"+getName());
    }
}

class ResearchProject extends Project{

    @Override
    public double calculateCost() {
        double RsPrCo = 20000;
        System.out.println("Reasearch Project Cost will be :"+RsPrCo);
        return RsPrCo;
    }

    @Override
    public void getProjectDetails() {
        System.out.println("Research Project : "+getName());
    }

}

class Main{
    public static void main(String[] args) {
        InternalProject IP = new InternalProject();
        ClientProject CP = new ClientProject();
        ResearchProject RP = new ResearchProject();

        IP.setProjectName("Internal Event Management System");
        IP.setDeadLine("2 days");
        IP.setTeamSize(5);
        IP.setBudget(35000);

        CP.setProjectName("AI Generated Project for Client");
        CP.setDeadLine("4 days");
        CP.setTeamSize(3);
        CP.setBudget(30000);


        RP.setProjectName("Artificial Intelligence Research");
        RP.setDeadLine("6 days");
        RP.setTeamSize(5);
        RP.setBudget(50000);


        List<Project> LsPr = new ArrayList<>();
        LsPr.add(IP);
        LsPr.add(CP);
        LsPr.add(RP);

        for(Project itPr : LsPr) {
            System.out.println("Project Name :"+itPr.getName());
            System.out.println("DeadLine : "+ itPr.getDeadLine());
            System.out.println("Team Size :" +itPr.getTeamSize());
            System.out.println("Budget :"+ itPr.getBudget());

            itPr.calculateCost();
            itPr.getProjectDetails();
            System.out.println();

        }

    }
}


