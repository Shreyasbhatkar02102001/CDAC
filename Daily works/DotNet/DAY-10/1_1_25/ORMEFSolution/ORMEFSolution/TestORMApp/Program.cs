// Ensure database is created
using System;
using TestORMApp.Contexts;
using TestORMApp.Managers;
using TestORMApp.Repositories;

// add-migration tfl
// update-database


/*
  Two  Entity Relationship
    1. One to many
 */
/*using (var context = new BlogContext())
{
    BlogRepository repo = new BlogRepository(context);
    repo.Initialize();
    repo.ShowAll();
}
*/



/*
using (var context = new BlogContext())
{
    context.Database.EnsureCreated();  // Creates the DB if it doesn't exist
}

// Menu for CRUD operations
Console.WriteLine("Welcome to Transflower Post Management System");
Console.WriteLine("Choose an operation: ");
Console.WriteLine("1. Create");
Console.WriteLine("2. Read");
Console.WriteLine("3. Update");
Console.WriteLine("4. Delete");

var choice = Console.ReadLine();

switch (choice)
{
    case "1":
        BlogPostManager.CreateBlogPost();
        break;
    case "2":
        BlogPostManager.ReadBlogPosts();
        break;
    case "3":
        BlogPostManager.UpdateBlogPost();
        break;
    case "4":
        BlogPostManager.DeleteBlogPost();
        break;
    default:
        Console.WriteLine("Invalid choice!");
        break;
}

*/



// Ensure the database is created
using (var context = new HRDbContext())
{
    context.Database.EnsureCreated();  // Creates the DB if it doesn't exist
}

// Menu for CRUD operations
Console.WriteLine("Welcome to Transflower HR Management System");
Console.WriteLine("Choose an operation: ");
Console.WriteLine("1. Create Employee and Department");
Console.WriteLine("2. Read Employees and Departments");
Console.WriteLine("3. Update Employee");
Console.WriteLine("4. Delete Employee");

var choice = Console.ReadLine();

switch (choice)
{
    case "1":
        HRManager.CreateEmployeeAndDepartment();
        break;
    case "2":
        HRManager.ReadEmployeesAndDepartments();
        break;
    case "3":
        HRManager.UpdateEmployee();
        break;
    case "4":
        HRManager.DeleteEmployee();
        break;
    default:
        Console.WriteLine("Invalid choice!");
        break;
}