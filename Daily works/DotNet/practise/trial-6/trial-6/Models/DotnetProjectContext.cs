using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using trial_6.Models;  // Ensure this namespace is correct

namespace trial_6.Models
{
    public partial class DotnetProjectContext : IdentityDbContext<SignUp>  // Inherit from IdentityDbContext<SignUp>
    {
        public DotnetProjectContext()
        {
        }

        public DotnetProjectContext(DbContextOptions<DotnetProjectContext> options)
            : base(options)
        {
        }

        public virtual DbSet<ContactU> ContactUs { get; set; }  // DbSet for ContactU entity
        public virtual DbSet<SignUp> SignUps { get; set; }  // DbSet for SignUp entity

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
                // Use the connection string from configuration (appsettings.json)
                optionsBuilder.UseMySQL("Server=localhost;Database=dotnetProject;User=root;Password=cdac;");
            }
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);  // Required for Identity

            // Configure the ContactU entity
            modelBuilder.Entity<ContactU>(entity =>
            {
                entity.HasKey(e => e.ContactId).HasName("PRIMARY");  // Set ContactId as the primary key

                entity.ToTable("contact_us");  // Set the table name

                // Configure unique indexes
                entity.HasIndex(e => e.Email, "Email").IsUnique();
                entity.HasIndex(e => e.PhoneNumber, "Phone_Number").IsUnique();

                // Configure properties
                entity.Property(e => e.ContactId).HasColumnName("Contact_Id");
                entity.Property(e => e.Email).HasMaxLength(100);
                entity.Property(e => e.Name).HasMaxLength(100);
                entity.Property(e => e.PhoneNumber)
                    .HasMaxLength(15)
                    .HasColumnName("Phone_Number");
                entity.Property(e => e.QueryMessage)
                    .HasColumnType("text")
                    .HasColumnName("Query_Message");
            });

            // Configure the SignUp entity
            modelBuilder.Entity<SignUp>(entity =>
            {
                entity.ToTable("sign_up");  // Set the table name

                // Configure Email as the primary key
                entity.HasKey(e => e.Email);  // Set Email as the primary key

                // Map the Id property to Email
                entity.Property(e => e.Id).HasColumnName("Email");

                // Configure unique indexes
                entity.HasIndex(e => e.Email).IsUnique();  // Unique index on Email
                entity.HasIndex(e => e.PhoneNumber).IsUnique();  // Unique index on PhoneNumber

                // Configure custom properties
                entity.Property(e => e.Name).HasMaxLength(100);
                entity.Property(e => e.ConfirmPassword).HasMaxLength(255);
                entity.Property(e => e.Role).HasColumnType("enum('Customer','Chef')");
            });

            // Configure Identity-related tables
            modelBuilder.Entity<IdentityUserLogin<string>>(entity =>
            {
                entity.HasKey(e => new { e.LoginProvider, e.ProviderKey });  // Composite primary key
            });

            modelBuilder.Entity<IdentityUserRole<string>>(entity =>
            {
                entity.HasKey(e => new { e.UserId, e.RoleId });  // Composite primary key
            });

            modelBuilder.Entity<IdentityUserToken<string>>(entity =>
            {
                entity.HasKey(e => new { e.UserId, e.LoginProvider, e.Name });  // Composite primary key
            });

            OnModelCreatingPartial(modelBuilder);
        }

        partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
    }
}