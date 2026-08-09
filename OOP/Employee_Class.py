class Employee:
    def __init__(self, name, employee_id, salary):
        self.name = name
        self.employee_id = employee_id
        self.salary = salary

    def display(self):
        print("Employee Details:")
        print("Name:", self.name)
        print("Employee ID:", self.employee_id)
        print("Salary:", self.salary)


# Create an Employee object
employee = Employee("Karan", 101, 50000)

employee.display()