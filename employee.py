# Base Class
class Employee:
    def __init__(self, employeeNumber, basicSalary):
        self.employeeNumber = employeeNumber
        self.basicSalary = basicSalary

    def getEmployeeNumber(self):
        return self.employeeNumber

    def getBasicSalary(self):
        return self.basicSalary

    def getPay(self):
        return self.basicSalary


# Subclass: Manager
class Manager(Employee):
    def __init__(self, employeeNumber, basicSalary, allowance):
        super().__init__(employeeNumber, basicSalary)
        self.allowance = allowance

    def getAllowance(self):
        return self.allowance

    # Overriding getPay()
    def getPay(self):
        return self.basicSalary + self.allowance


# Subclass: Secretary
class Secretary(Employee):
    def __init__(self, employeeNumber, basicSalary):
        super().__init__(employeeNumber, basicSalary)


# Subclass: Technician
class Technician(Employee):
    def __init__(self, employeeNumber, basicSalary):
        super().__init__(employeeNumber, basicSalary)


# Subclass: Clerk
class Clerk(Employee):
    def __init__(self, employeeNumber, basicSalary):
        super().__init__(employeeNumber, basicSalary)


# Test Program
def main():
    manager = Manager(101, 5000, 1500)
    secretary = Secretary(102, 3000)
    technician = Technician(103, 3500)
    clerk = Clerk(104, 2500)

    employees = [manager, secretary, technician, clerk]

    for emp in employees:
        print("Employee Number:", emp.getEmployeeNumber())
        print("Pay:", emp.getPay())
        print("--------------------")


main()
