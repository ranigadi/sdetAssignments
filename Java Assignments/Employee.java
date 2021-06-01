import java.util.ArrayList;
import java.io.*;

 

public class Employee {
int id;
String name;
long salary;
static ArrayList el = new ArrayList();
static int count = 0; //to track the no. of Employes

 

Employee()
{
}


//constructor for initializing Employee objects


Employee(int id, String name, long salary)
{
this.id = id;
this.name = name;
this.salary = salary;
count++;
}

 
//method to store Employes details in an arraylist

public void putDetails(Employee e)
{
el.add(e);
}

 

//method to retreive Employee objects



public Employee getDetails(int id)
{
Employee e = (Employee)el.get(id);
return e;
}

 


public static void main(String[] args) throws IOException
{



BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Employee e = new Employee();
Employee e1 = new Employee(1, "Rani", 15000);
Employee e2 = new Employee(2, "Trilok", 20000);
Employee e3 = new Employee(3, "Jishnu", 21000);
Employee e4 = new Employee(4, "Arjun", 18000);
Employee e5 = new Employee(5, "Sofia", 16000);
Employee e6 = new Employee(6, "Surya", 30000);

 


e.putDetails(e1);
e.putDetails(e2);
e.putDetails(e3);
e.putDetails(e4);
e.putDetails(e5);
e.putDetails(e6);

 

System.out.println("The total number of Employes are: " +count);
System.out.println(" ");

 

while(true)
{
System.out.println("Enter Employee id to get the Employee Information: ");
int id = Integer.parseInt(br.readLine());
boolean flag = false;

 

for(int i=0; i<count;i++) {
Employee es = e1.getDetails(i);
if(id == es.id)
{
System.out.println("The Information of the Employee with id " +id +" is: ");
System.out.print(es.id +" " +es.name+" " +es.salary);
flag = true;
break;
}
}

 

System.out.println(" ");

 

if(!flag)
{
System.out.println("No Information found with the entered employee id " +id);
}
System.out.println(" ");
String ch = null;

 

while(true)
{
System.out.println("Do you Want to Continue(y/n)?)");
System.out.println(" ");
ch = br.readLine();
if(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")) break;
if(!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")))
{
System.out.println("Invalid option : please type y/n");
System.out.println(" ");
}
}

 

if(ch.equalsIgnoreCase("n"))
{
System.out.println(" ");
System.out.println("Thank you");
break;
}
}
}
}