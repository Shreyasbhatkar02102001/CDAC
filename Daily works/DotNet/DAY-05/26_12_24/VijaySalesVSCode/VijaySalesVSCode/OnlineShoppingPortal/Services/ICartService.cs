
using OnlineShoppingPortal.Models;
namespace OnlineShoppingPortal.Services
{
    public interface ICartService
    {
        void AddToCart(int productId);
        void RemoveFromCart(int productId);
        void ClearCart();
        Cart GetCart();
    }
}
