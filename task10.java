1. Create a class called "Person" with attributes "name" and "age". Also create a constructor and getter methods for the attributes


public class Person {
    
    private String name;
    private int age;
    
     
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
 
    public static void main(String[] args) {
        
        Person person = new Person("John", 30);
        
         
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}


2. Create an implementation for a java class named Employee that represents an employee with attributes including ID, name, and salary. The class includes a method called raise Salary(percent), which updates the salary by a specified percentage

public class Employee {
     
    private int id;
    private String name;
    private double salary;
    
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
     
    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
        System.out.println("Salary raised by " + percent + "%. New salary: $" + salary);
    }
    
     
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
     
    public static void main(String[] args) {
        
        Employee emp = new Employee(101, "John Doe", 50000);
        
       
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());
        
        
        emp.raiseSalary(10);
    }
}

3. Create a class circle class with radius as data member. Create two constructors (no argument, and two arguments) and a method to calculate Circumference

public class Circle {
 
    private double radius;
    
 
    public Circle() {
 
        this.radius = 0;  
    }
    
    public Circle(double radius) {
 
        this.radius = radius;
    }
    
 
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
 
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
 
    public static void main(String[] args) {
 
        Circle circle1 = new Circle(); 
        Circle circle2 = new Circle(5);  
        
        
        System.out.println("Circumference of circle 1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle 2: " + circle2.calculateCircumference());
    }
}


4.Create a class Account class with balance as data member. Create two constructors (no argument, and two arguments) and methods to withdraw and deposit balance

public class Account {
    
    private double balance;
    
     
    public Account() {
         
        this.balance = 0;  
    }
    
    public Account(double initialBalance) {
         
        this.balance = initialBalance;
    }
    
             
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }


5.Create a Tea class in Java that includes the following methods:

public class Tea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

     
    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

     
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
        isPrepared = true;
    }

 
    public void addMilk() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        }
    }

     
    public void addSugar() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        }
    }

    
    public void serveTea() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else if (!hasMilk && !hasSugar) {
            System.out.println("Serving basic tea.");
        } else if (hasMilk && !hasSugar) {
            System.out.println("Serving tea with milk.");
        } else if (!hasMilk && hasSugar) {
            System.out.println("Serving tea with sugar.");
        } else {
            System.out.println("Serving tea with milk and sugar.");
        }
    }

    
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();
        tea.serveTea();
    }
}
    
   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }
    
     
    public double getBalance() {
        return balance;
    }
    
    
    public static void main(String[] args) {
         
        Account acc1 = new Account();  
        Account acc2 = new Account(1000); 
        
         
        acc1.deposit(500);
        acc1.withdraw(200);
        
        acc2.withdraw(1500);
        acc2.deposit(300);
    }
}

6.Create three subclasses of the Tea class: Black Tea, GreenTea, and Herbal Tea. Each subclass should override the prepare Tea() method to prepare the specific type of tea (black tea, green tea, or herbal tea) with appropriate ingredients and brewing times.

 
public class Tea {
    protected boolean isPrepared;
    protected boolean hasMilk;
    protected boolean hasSugar;

 
    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

 
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
        isPrepared = true;
    }

 
    public void addMilk() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        }
    }

 
    public void addSugar() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        }
    }

 
    public void serveTea() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else if (!hasMilk && !hasSugar) {
            System.out.println("Serving basic tea.");
        } else if (hasMilk && !hasSugar) {
            System.out.println("Serving tea with milk.");
        } else if (!hasMilk && hasSugar) {
            System.out.println("Serving tea with sugar.");
        } else {
            System.out.println("Serving tea with milk and sugar.");
        }
    }
}

 
public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves.");
        isPrepared = true;
    }
}

 
public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves.");
        isPrepared = true;
    }
}

 
public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
        isPrepared = true;
    }
}


7.Implement polymorphism in your program by creating an array of Tea objects that includes instances of the Tea class and its subclasses.

public class Main {
    public static void main(String[] args) {
 
        Tea[] teas = new Tea[4];

 
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

 
        for (Tea tea : teas) {
            tea.prepareTea();
            tea.serveTea();
            System.out.println();  
        }
    }
}

 
class Tea {
    protected boolean isPrepared;
    protected boolean hasMilk;
    protected boolean hasSugar;

    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
        isPrepared = true;
    }

    public void addMilk() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        }
    }

    public void addSugar() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        }
    }

    public void serveTea() {
        if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else if (!hasMilk && !hasSugar) {
            System.out.println("Serving basic tea.");
        } else if (hasMilk && !hasSugar) {
            System.out.println("Serving tea with milk.");
        } else if (!hasMilk && hasSugar) {
            System.out.println("Serving tea with sugar.");
        } else {
            System.out.println("Serving tea with milk and sugar.");
        }
    }
}

 
class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves.");
        isPrepared = true;
    }
}

 
class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves.");
        isPrepared = true;
    }
}

 
class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
        isPrepared = true;
    }
}



