using System.ComponentModel.DataAnnotations;
namespace Main_mvc.Models
{
    public class Contact
    {

        public int contactId { get; set; }

        [Required]
        public string name { get; set; }
        [Required]
        public string email { get; set; }
        [Required]
        public string phoneNumber { get; set; }
        [Required]
        public string queryMessage { get; set; }

        public static implicit operator List<object>(Contact v)
        {
            throw new NotImplementedException();
        }
    }
}
