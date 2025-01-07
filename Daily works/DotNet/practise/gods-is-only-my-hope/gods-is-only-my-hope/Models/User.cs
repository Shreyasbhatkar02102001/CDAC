using System.ComponentModel.DataAnnotations;

namespace gods_is_only_my_hope.Models;

public partial class User
{
    public int UserId { get; set; }

    [Required(ErrorMessage = "Name is required.")]
    [StringLength(100, ErrorMessage = "Name cannot exceed 100 characters.")]
    public string Name { get; set; } = null!;

    [Required(ErrorMessage = "Email is required.")]
    [EmailAddress(ErrorMessage = "Invalid email address.")]
    public string Email { get; set; } = null!;

    [Required(ErrorMessage = "Phone number is required.")]
    [Phone(ErrorMessage = "Invalid phone number.")]
    [MinLength(10, ErrorMessage = "Phone number must be at least 10 digits.")]
    public string PhoneNumber { get; set; } = null!;
}