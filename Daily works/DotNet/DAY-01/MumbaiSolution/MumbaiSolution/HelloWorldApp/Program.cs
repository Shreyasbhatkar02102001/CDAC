using System;
using Catalog;

namespace HelloWorldApp
{
   

    //DRY:Don't repeat your self
    //KISS
    //Keep It Simpile and Stupid

    internal class Program
    {
        static void Main(string[] args)
        {
            const int count = 34;
            Console.WriteLine(count);
            string fullName = "Ravi Tambade";
            Console.WriteLine(fullName);

            Person person = new Person();
            
            person.Id = count;
            person.Title = "Mentor";
            person.Description = fullName;

            Console.WriteLine(person.Title + " "+ person.Description);
            Console.WriteLine(" \n Welcome to .net  \n");

            string resultString=string.Format(person.Title + " " +  person.Description);
            Console.WriteLine(resultString);

            HelloWorldApp.Point pt1 = new HelloWorldApp.Point();

            Product product = new Product();
            product.Id = count;
            product.Title = "Rose";
            product.Description = "Valentine Flower";
            product.UnitPrice = 45;
            product.Quantity = 6000;
            product.ImageUrl = "/images/rose.jpg";

            Console.Write(product);
            Console.ReadLine();
        }

    }
}
