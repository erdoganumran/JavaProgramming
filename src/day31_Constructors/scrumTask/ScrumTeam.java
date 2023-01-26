package day31_Constructors.scrumTask;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester> testersList= new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {//i have to provide these inputs
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testersList.size() +
                ", devopsList=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';

        //    toString(): prints number of tester,& developers,  PO name, SM name, BA name
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    } //adds the given tester to the testers ArrayList

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    } //adds the given testers to the testers ArrayList

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    } //adds the given developer to the developers ArrayList

    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    } //adds the given developers to the developers ArrayList

    public void removeTester(long employeeID){
        testersList.removeIf(p-> p.employeeID==employeeID);
    }//removes the given tester from the testers ArrayList

    public void removeDeveloper(long employeeID){
        devopsList.removeIf(p-> p.employeeID==employeeID);
    } //removes the developer from the developers ArrayList


}


