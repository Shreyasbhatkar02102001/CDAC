using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary1
{
    public class Class1
    {
        public class Product
        {
            public int Id { get; set; }

            public string Title {  get; set; }

            public string Description { get; set; }

            public double UnitPrice { get; set; }

            public int Quantity { get; set; }

            public string ImageUrl { get; set; }

            // constructor overloading 
            public Product() { }

            public Product(int id, string title, string description, double price, int quantity, string img)
            {
                Id = id;
                Title = title;
                Description = description;
                UnitPrice = price;
                Quantity = quantity;
                ImageUrl = img;
            }

            ~Product() 
            { 
                   
            }




    }
}
