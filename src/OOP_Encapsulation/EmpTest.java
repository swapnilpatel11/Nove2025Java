package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(30);
		e1.setGender('M');
		e1.setSalary(13.35);
		e1.setActive(true);

		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getGender());
		System.out.println(e1.getSalary());
		System.out.println(e1.isActive());

		Employee e2 = new Employee();
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());

	}

}
