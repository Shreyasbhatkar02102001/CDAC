using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using System.Threading.Tasks;
using Catalog;
namespace Inventory
{

    //Helper class
    public  static  class StoreManager
    {

        public static  List<Product> GetAll() {

            return new List<Product>();
        }

        public static  Product GetProduct(int id)
        {
            return new Product();
        }

        public static  bool Create(Product product)
        {
            bool status = false;
            ////
            return status;
        }
        public static  bool Update(Product product) { 
            
            bool status = false;

            return status;

        }

        public static  bool Delete(int id) {
            bool status = false;
            //

            return status;
        }

    }
}
