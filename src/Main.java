import java.time.LocalDate;

import com.psybergate.git.tut.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1111L, "name", LocalDate.now());
		System.out.println(customer);
	}
}