public class Employee {

    private String FIO;
    private int Department;
    private int Salary;
    public static int Counter = 0;
    public int Id;

    public static int getCounter() {
        return Counter;
    }

    public int getId() { return this.Id; }
    public String getFIO() { return this.FIO; }
    public int getDepartment() { return this.Department; }
    public float getSalary() { return this.Salary; }


    public void SetFIO(String fio) { this.FIO = fio; }
    public void SetDepartment(int dept) { this.Department = dept; }
    public void SetSalary(int sal) { this.Salary = sal; }

    public Employee(String fio, int dept, float salary) {
        this.FIO = fio;
        this.Department = dept;
        this.Salary = (int) salary;
        this.Id = Counter++;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }


    }
