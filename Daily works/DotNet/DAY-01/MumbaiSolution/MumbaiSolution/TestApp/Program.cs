//Minimal Code Strategy
using CRM;
using Catalog;
using Inventory;

int count = 56;
count++;
if(count > 100)
{
    count = 0;
}

Customer customer = new Customer();
customer.Name = "CDAC";
customer.Address = "Mumbai";
customer.Id = 34;

Console.WriteLine(customer);
List<Product> allProducts=StoreManager.GetAll();

Console.WriteLine("Hello, World!");
