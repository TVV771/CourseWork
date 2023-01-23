public class Employee {

    private String fio;
    private int department;
    private int salary;
    public static int counter = 0;
    public int id;

    public static int getCounter() {
        return counter;
    }

    public int getId() { return this.id; }
    public String getFIO() { return this.fio; }
    public int getDepartment() { return this.department; }
    public float getSalary() { return this.salary; }


    public void SetFIO(String fio) { this.fio = fio; }
    public void SetDepartment(int dept) { this.department = dept; }
    public void SetSalary(int sal) { this.salary = sal; }

    public Employee(String fio, int dept, float salary) {
        this.fio = fio;
        this.department = dept;
        this.salary = (int) salary;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + fio + " Dept: " + department + " Salary: " + salary;
    }


    }
