class Student:
    def __init__(self, name, age, roll_number):
        self.name = name
        self.age = age
        self.roll_number = roll_number

    def display(self):
        print("Student Details:")
        print("Name:", self.name)
        print("Age:", self.age)
        print("Roll Number:", self.roll_number)

student = Student("Karan", 21, 101)

student.display()