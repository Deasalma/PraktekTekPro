package task3;

public class EmployeeTest {
	public static void main (String[] args){
		/* Employee[] staff = new Employee[3];
		 staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		 staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		 staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		int i;
		 for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		 for (i = 0; i < 3; i++) staff[i].print();
		 */
		 
		 Employee[] staff1 = new Employee[3];
		 staff1[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		 staff1[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		 staff1[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		 Sortable.shell_sort(staff1);
		 int i;
		 for (i = 0; i < 3; i++) staff1[i].raiseSalary(5);
		 for (i = 0; i < 3; i++) staff1[i].print();

		}
}
