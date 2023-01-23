public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;

    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = (int) employee.getSalary();
                result = employee;
            }
            }

        return result;
    }

    public static float calculateAverageSalary() {
        int count = 1;
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == count) {
                sum += employee.getSalary();
                count++;
            }
        }
        return sum / (float) count;
    }
    public static void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null){

            }
            System.out.println(employee.getFIO());
        }
    }
    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Ануфриев Михаил Константинович", 1, 25500f),

        new Employee("Васильев Дмитрий Андреевич", 2, 31450f),
        new Employee("Дудин Сергей Николаевич", 3, 40430f),
        new Employee("Костромин Роман Сергеевич", 4, 56200f),
        new Employee("Пермякова Дарья Андреевна", 5, 77200f)
        };
        employees[0] = new Employee("Ануфриев Михаил Константинович", 1,25500f);
        printFullNames();
        printEmployees();
        System.out.println("avg = " + calculateAverageSalary());
    }
}






