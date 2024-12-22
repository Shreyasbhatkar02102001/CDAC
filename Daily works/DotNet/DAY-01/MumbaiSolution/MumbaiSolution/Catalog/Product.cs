using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Catalog
{
    public class Product
    {
        public int Id { get; set; }
        public string Title  { get; set; }
        public string Description { get; set; }
        public double UnitPrice { get; set; }
        public int Quantity {  get; set; }
        public string ImageUrl {  get; set; }

        //constructor overloading
        public Product()
        {

        }
        public Product(int id, string title, string description, 
            double price, int stock, string image)
        {
            Id = id;
            Title = title;
            Description = description;
            ImageUrl = image;
            Quantity = stock;
            UnitPrice = price;

        }


        ~Product()
        {

        }


        public override string ToString()
        {
            string result = string.Format(this.Title + " " + this.UnitPrice);
            //return base.ToString();
            return result;
        }
    }
}
