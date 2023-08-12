package Part1.oops;

public class encapsulation {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setEmpId(212, "ankit");
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
    }
}
class employee{
    private int empId;
    private String empName;
//    to give this access to main class used getter and setter methods

    public void setEmpId(int empId, String name) {
        this.empId = empId;
        this.empName  = name;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
}
