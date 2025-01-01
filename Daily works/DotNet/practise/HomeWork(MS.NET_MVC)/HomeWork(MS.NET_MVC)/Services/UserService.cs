using HomeWork_MS.NET_MVC_.Repository;
using HomeWork_MS.NET_MVC_.Models;
namespace HomeWork_MS.NET_MVC_.Services
{
    public class UserService : IUserService
    {
        private IUserRepository userRepo;

        
        public void insert(User user)
        {
            //throw new NotImplementedException();
            userRepo.insert(user);
        }

        public bool validate(string email, string password)
        {
            return userRepo.validate(email, password);
        }
    }
}
