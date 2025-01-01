using System.ComponentModel.DataAnnotations;

namespace OnlineShoppingPortal.Models
{
    public class Customer
    {
        // data constraints

        [Required]  
        public string FirstName { get; set; }
        
        [Required]
        public string LastName { get; set; } = string.Empty;

        [Range(18,100)]
        public int Age { get; set; }

    }
}
