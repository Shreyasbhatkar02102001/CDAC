using CRUD_basic.Models;

namespace CRUD_basic.Services.Interfaces
{
    public interface IUserService
    {
        public List<User> getAll();

        public User getById(int id);

        public void add(User user);

        public void update(User user);

        public void deleteById(int id);
    }
}
