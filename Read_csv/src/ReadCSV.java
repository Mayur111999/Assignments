import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {

	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\Mayur\\Documents\\emp.csv"));

		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Employee> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			Employee emp = new Employee();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setId(Integer.parseInt(data));
				else if (index == 1)
					emp.setName(data);
				else if (index == 2)
					emp.setRole(data);
				else if (index == 3)
					emp.setSalary(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}
		
		//close reader
		reader.close();
		
		System.out.println(empList);
		
	}
}

/*OUTPUT
[
ID = 101  ::Name  Ram  ::Role = Developer  ::Salary = 30000, 
ID = 102  ::Name  Rajesh  ::Role = Lead  ::Salary = 50000, 
ID = 103  ::Name  Nidhi  ::Role = Manager  ::Salary = 60000, 
ID = 104  ::Name  Suraj  ::Role = Developer  ::Salary = 30000]
*/