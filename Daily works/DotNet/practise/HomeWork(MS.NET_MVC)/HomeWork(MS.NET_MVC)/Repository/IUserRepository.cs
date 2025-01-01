using HomeWork_MS.NET_MVC_.Models;

namespace HomeWork_MS.NET_MVC_.Repository
{
    public interface IUserRepository
    {

        //void insert(string FirstName, string LastName, string email, int Contact, string password);
        void insert(User user);
        bool validate(string email, string password);
    }
}
