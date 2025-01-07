using System.ComponentModel.DataAnnotations;

namespace gods_is_only_my_hope.Models;

public partial class Menumanagement
{
    public int Id { get; set; }

    [Required(ErrorMessage = "Description is required.")]
    [StringLength(200, ErrorMessage = "Description cannot exceed 200 characters.")]
    public string? Description { get; set; }

    [Required(ErrorMessage = "Name is required.")]
    [StringLength(100, ErrorMessage = "Name cannot exceed 100 characters.")]
    public string? Name { get; set; }

    [Required(ErrorMessage = "Price is required.")]
    [Range(0, 10000, ErrorMessage = "Price must be between 0 and 10,000.")]
    public int? Price { get; set; }
}