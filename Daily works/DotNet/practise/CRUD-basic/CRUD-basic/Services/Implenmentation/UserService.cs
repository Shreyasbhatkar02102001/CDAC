using CRUD_basic.Models;
using CRUD_basic.Repositories;
using CRUD_basic.Services.Interfaces;

namespace CRUD_basic.Services.Implenmentation
{
    public class UserService : IUserService
    {
        public IUserRepository UserRepository;

        public UserService(IUserRepository userRepo)
        {
            UserRepository = userRepo;
        }

        public void add(User user)
        {
            UserRepository.add(user);
        }

        public void deleteById(int id)
        {
            UserRepository.deleteById(id);
        }

        public List<User> getAll()
        {
            return UserRepository.getAll();
        }

        public User getById(int id)
        {
            return UserRepository.getById(id);
        }

        public void update(User user)
        {
            UserRepository.update(user);
        }
    }
}
