using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace CRUD_using_framework_core.Models
{
    public class User
    {
        [key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int Id { get; set; }

        [Required]
        [StringLength(50, ErrorMessage ="Less than 50 string length")]
        public string Name { get; set; }

        public string Email { get; set; }

        public string Password { get; set; }

        
    }
}
