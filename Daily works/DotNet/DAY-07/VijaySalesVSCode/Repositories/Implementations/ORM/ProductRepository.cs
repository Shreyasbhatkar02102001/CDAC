using Repositories.Interfaces;
using Entities;

using MySql.Data.EntityFrameworkCore;


namespace Repositories.ORM

{
    public class ProductRepository : IProductRepository
    {
        public void Delete(int id)
        {
            throw new NotImplementedException();
        }

        public List<Product> GetAll()
        {
            throw new NotImplementedException();
        }

        public Product GetById(int id)
        {
            throw new NotImplementedException();
        }

        public void Insert(Product product)
        {
            throw new NotImplementedException();
        }

        public void Update(Product product)
        {
            throw new NotImplementedException();
        }
    }
}
