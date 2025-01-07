using System.ComponentModel.DataAnnotations;

namespace gods_is_only_my_hope.Models;

public partial class Zerowaste
{
    public long Id { get; set; }

    [Required(ErrorMessage = "Donated To is required.")]
    [StringLength(100, ErrorMessage = "Donated To cannot exceed 100 characters.")]
    public string? DonatedTo { get; set; }

    [Required(ErrorMessage = "Name is required.")]
    [StringLength(100, ErrorMessage = "Name cannot exceed 100 characters.")]
    public string? Name { get; set; }

    [Required(ErrorMessage = "Quantity is required.")]
    [Range(1, int.MaxValue, ErrorMessage = "Quantity must be a positive number.")]
    public string? Quantity { get; set; }
}