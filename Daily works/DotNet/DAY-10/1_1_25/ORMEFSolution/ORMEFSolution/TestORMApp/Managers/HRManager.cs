using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestORMApp.Contexts;
using TestORMApp.Entities;

namespace TestORMApp.Managers
{
    public class HRManager
    {

        // CREATE operation for Employee and Department
       public  static void CreateEmployeeAndDepartment()
        {
            using (var context = new HRDbContext())
            {
                // Create Department
                var department = new Department
                {
                    Name = "Software Engineering"
                };
                context.Departments.Add(department);
                context.SaveChanges(); // Save Department first to get its ID

                // Create Employee
                var employee = new Employee
                {
                    Name = "Ritesh Wadhwani",
                    Position = "Software Developer",
                    DepartmentId = department.DepartmentId // Set the foreign key
                };

                context.Employees.Add(employee);
                context.SaveChanges(); // Save Employee

                Console.WriteLine("Employee and Department created!");
            }
        }

        // READ operation to display Employees and their Departments
        public static void ReadEmployeesAndDepartments()
        {
            using (var context = new HRDbContext())
            {
                var employees = context.Employees.Include(e => e.Department) // Include the related Department
                    .ToList();

                foreach (var employee in employees)
                {
                    Console.WriteLine($"Employee: {employee.Name}, Position: {employee.Position}, Department: {employee.Department.Name}");
                }
            }
        }

        // UPDATE operation for Employee
        public static void UpdateEmployee()
        {
            Console.WriteLine("Enter the Employee ID to update: ");
            var id = int.Parse(Console.ReadLine());

            using (var context = new HRDbContext())
            {
                var employee = context.Employees.Find(id);
                if (employee != null)
                {
                    Console.WriteLine($"Current Name: {employee.Name}");
                    Console.WriteLine("Enter new Name: ");
                    employee.Name = Console.ReadLine();

                    Console.WriteLine($"Current Position: {employee.Position}");
                    Console.WriteLine("Enter new Position: ");
                    employee.Position = Console.ReadLine();

                    context.SaveChanges(); // Save the updated Employee
                    Console.WriteLine("Employee updated!");
                }
                else
                {
                    Console.WriteLine("Employee not found!");
                }
            }
        }

        // DELETE operation for Employee
       public  static void DeleteEmployee()
        {
            Console.WriteLine("Enter the Employee ID to delete: ");
            var id = int.Parse(Console.ReadLine());

            using (var context = new HRDbContext())
            {
                var employee = context.Employees.Find(id);
                if (employee != null)
                {
                    context.Employees.Remove(employee);
                    context.SaveChanges(); // Delete the Employee
                    Console.WriteLine("Employee deleted!");
                }
                else
                {
                    Console.WriteLine("Employee not found!");
                }
            }
        }
    }
}

