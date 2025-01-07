using System.ComponentModel.DataAnnotations;

namespace gods_is_only_my_hope.Models;

public partial class Dietary
{
    public int DietaryId { get; set; }

    [Required(ErrorMessage = "User Name is required.")]
    [StringLength(100, ErrorMessage = "User Name cannot exceed 100 characters.")]
    public string UserName { get; set; } = null!;

    [Required(ErrorMessage = "Dietary Preference is required.")]
    [StringLength(100, ErrorMessage = "Dietary Preference cannot exceed 100 characters.")]
    public string DietaryPreference { get; set; } = null!;

    [Required(ErrorMessage = "Description is required.")]
    [MinLength(10, ErrorMessage = "Description must exceed at least 10 digits.")]
    [StringLength(500, ErrorMessage = "Description cannot exceed 500 characters.")]
    public string? Description { get; set; }
}