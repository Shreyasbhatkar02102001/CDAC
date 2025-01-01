using HomeWork_MS.NET_MVC_.Models;
using HomeWork_MS.NET_MVC_.Repository;

namespace HomeWork_MS.NET_MVC_.Services
{
    public interface IUserService
    {
        void insert(User user);

        bool validate(string email, string password);
    }
}
