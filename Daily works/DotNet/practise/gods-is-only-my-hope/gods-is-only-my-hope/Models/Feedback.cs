using System.ComponentModel.DataAnnotations;

namespace gods_is_only_my_hope.Models;

public partial class Feedback
{
    public long Id { get; set; }

    [Required(ErrorMessage = "Chef Name is required.")]
    [StringLength(100, ErrorMessage = "Chef Name cannot exceed 100 characters.")]
    public string? ChefName { get; set; }

    [Required(ErrorMessage = "Feedback is required.")]
    [StringLength(500, ErrorMessage = "Feedback cannot exceed 500 characters.")]
    public string? Feedback1 { get; set; }
}