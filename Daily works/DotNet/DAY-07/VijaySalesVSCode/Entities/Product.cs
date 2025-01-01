using System.ComponentModel.DataAnnotations;

namespace Entities
{
    public class Product
    {

        public int Id { get; set; }

        [Required]
        public string Name { get; set; }
        public string Description { get; set; }

        [Range(50, 10000)]
        public double UnitPrice { get; set; }

        public string Image { get; set; }

        [Range(10, 6000)]
        public int Quantity { get; set; }


    }
}
