using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace customer_bootstrap.Models;

public partial class DotnetProjectContext : DbContext
{
    public DotnetProjectContext()
    {
    }

    public DotnetProjectContext(DbContextOptions<DotnetProjectContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Chef> Chefs { get; set; }

    public virtual DbSet<ContactU> ContactUs { get; set; }

    public virtual DbSet<Dietary> Dietaries { get; set; }

    public virtual DbSet<Meal> Meals { get; set; }

    public virtual DbSet<Order> Orders { get; set; }

    public virtual DbSet<Payment> Payments { get; set; }

    public virtual DbSet<Rating> Ratings { get; set; }

    public virtual DbSet<Signup> Signups { get; set; }

    public virtual DbSet<Subscription> Subscriptions { get; set; }

    public virtual DbSet<TempUser> TempUsers { get; set; }

    public virtual DbSet<User> Users { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySQL("Server=localhost;Database=dotnetProject;User=root;Password=cdac;");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Chef>(entity =>
        {
            entity.HasKey(e => e.ChefId).HasName("PRIMARY");

            entity.ToTable("chef");

            entity.HasIndex(e => e.Email, "fk_chef_email");

            entity.Property(e => e.ChefId).HasColumnName("chef_id");
            entity.Property(e => e.Bio)
                .HasColumnType("text")
                .HasColumnName("bio");
            entity.Property(e => e.ContactInfo)
                .HasMaxLength(255)
                .HasColumnName("contact_info");
            entity.Property(e => e.CreatedAt)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("created_at");
            entity.Property(e => e.DeliveryArea)
                .HasMaxLength(255)
                .HasColumnName("delivery_area");
            entity.Property(e => e.Email).HasColumnName("email");
            entity.Property(e => e.Name)
                .HasMaxLength(100)
                .HasColumnName("name");
            entity.Property(e => e.ProfilePicture)
                .HasMaxLength(255)
                .HasColumnName("profile_picture");
            entity.Property(e => e.Rating)
                .HasPrecision(3)
                .HasDefaultValueSql("'0.00'")
                .HasColumnName("rating");
            entity.Property(e => e.UpdatedAt)
                .ValueGeneratedOnAddOrUpdate()
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("updated_at");

            entity.HasOne(d => d.EmailNavigation).WithMany(p => p.Chefs)
                .HasForeignKey(d => d.Email)
                .HasConstraintName("fk_chef_email");
        });

        modelBuilder.Entity<ContactU>(entity =>
        {
            entity.HasKey(e => e.ContactId).HasName("PRIMARY");

            entity.ToTable("contact_us");

            entity.HasIndex(e => e.Email, "Email").IsUnique();

            entity.HasIndex(e => e.PhoneNumber, "Phone_Number").IsUnique();

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

        modelBuilder.Entity<Dietary>(entity =>
        {
            entity.HasKey(e => e.DietaryId).HasName("PRIMARY");

            entity.ToTable("dietary");

            entity.Property(e => e.DietaryId).HasColumnName("dietary_id");
            entity.Property(e => e.Description)
                .HasColumnType("text")
                .HasColumnName("description");
            entity.Property(e => e.DietaryPreference)
                .HasMaxLength(100)
                .HasColumnName("dietary_preference");
            entity.Property(e => e.UserName)
                .HasMaxLength(100)
                .HasColumnName("user_name");
        });

        modelBuilder.Entity<Meal>(entity =>
        {
            entity.HasKey(e => e.MealId).HasName("PRIMARY");

            entity.ToTable("meals");

            entity.HasIndex(e => e.ChefId, "chef_id");

            entity.Property(e => e.MealId).HasColumnName("meal_id");
            entity.Property(e => e.ChefId).HasColumnName("chef_id");
            entity.Property(e => e.CuisineType)
                .HasMaxLength(50)
                .HasColumnName("cuisine_type");
            entity.Property(e => e.Description)
                .HasColumnType("text")
                .HasColumnName("description");
            entity.Property(e => e.DietaryTags)
                .HasMaxLength(100)
                .HasColumnName("dietary_tags");
            entity.Property(e => e.ImageUrl)
                .HasColumnType("blob")
                .HasColumnName("image_url");
            entity.Property(e => e.Ingredients)
                .HasColumnType("text")
                .HasColumnName("ingredients");
            entity.Property(e => e.MealPreference)
                .HasColumnType("enum('breakfast','lunch','dinner','snack')")
                .HasColumnName("meal_preference");
            entity.Property(e => e.MealType)
                .HasColumnType("enum('vegan','vegetarian','non-vegetarian')")
                .HasColumnName("meal_type");
            entity.Property(e => e.Name)
                .HasMaxLength(100)
                .HasColumnName("name");
            entity.Property(e => e.Price)
                .HasPrecision(10)
                .HasColumnName("price");

            entity.HasOne(d => d.Chef).WithMany(p => p.Meals)
                .HasForeignKey(d => d.ChefId)
                .HasConstraintName("meals_ibfk_1");
        });

        modelBuilder.Entity<Order>(entity =>
        {
            entity.HasKey(e => e.OrderId).HasName("PRIMARY");

            entity.ToTable("orders");

            entity.HasIndex(e => e.ChefId, "chef_id");

            entity.HasIndex(e => e.MealId, "meal_id");

            entity.HasIndex(e => e.UserId, "user_id");

            entity.Property(e => e.OrderId).HasColumnName("order_id");
            entity.Property(e => e.ChefId).HasColumnName("chef_id");
            entity.Property(e => e.DeliveryAddress)
                .HasMaxLength(255)
                .HasColumnName("delivery_address");
            entity.Property(e => e.DeliveryTimeSlot)
                .HasMaxLength(50)
                .HasColumnName("delivery_time_slot");
            entity.Property(e => e.MealId).HasColumnName("meal_id");
            entity.Property(e => e.OrderDate)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("order_date");
            entity.Property(e => e.PaymentMethod)
                .HasMaxLength(50)
                .HasColumnName("payment_method");
            entity.Property(e => e.PaymentStatus)
                .HasColumnType("enum('paid','pending')")
                .HasColumnName("payment_status");
            entity.Property(e => e.Quantity).HasColumnName("quantity");
            entity.Property(e => e.Status)
                .HasColumnType("enum('pending','confirmed','dispatched','delivered')")
                .HasColumnName("status");
            entity.Property(e => e.TotalAmount)
                .HasPrecision(10)
                .HasColumnName("total_amount");
            entity.Property(e => e.UserId).HasColumnName("user_id");

            entity.HasOne(d => d.Chef).WithMany(p => p.Orders)
                .HasForeignKey(d => d.ChefId)
                .OnDelete(DeleteBehavior.Cascade)
                .HasConstraintName("orders_ibfk_2");

            entity.HasOne(d => d.Meal).WithMany(p => p.Orders)
                .HasForeignKey(d => d.MealId)
                .OnDelete(DeleteBehavior.Cascade)
                .HasConstraintName("orders_ibfk_3");

            entity.HasOne(d => d.User).WithMany(p => p.Orders)
                .HasForeignKey(d => d.UserId)
                .OnDelete(DeleteBehavior.Cascade)
                .HasConstraintName("orders_ibfk_1");
        });

        modelBuilder.Entity<Payment>(entity =>
        {
            entity.HasKey(e => e.PaymentId).HasName("PRIMARY");

            entity.ToTable("payments");

            entity.HasIndex(e => e.OrderId, "order_id");

            entity.HasIndex(e => e.SubscriptionId, "subscription_id");

            entity.Property(e => e.PaymentId).HasColumnName("payment_id");
            entity.Property(e => e.AmountPaid)
                .HasPrecision(10)
                .HasColumnName("amount_paid");
            entity.Property(e => e.OrderId).HasColumnName("order_id");
            entity.Property(e => e.PaymentDate)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("payment_date");
            entity.Property(e => e.PaymentMethod)
                .HasMaxLength(50)
                .HasColumnName("payment_method");
            entity.Property(e => e.PaymentStatus)
                .HasMaxLength(20)
                .HasColumnName("payment_status");
            entity.Property(e => e.SubscriptionId).HasColumnName("subscription_id");

            entity.HasOne(d => d.Order).WithMany(p => p.Payments)
                .HasForeignKey(d => d.OrderId)
                .HasConstraintName("payments_ibfk_1");

            entity.HasOne(d => d.Subscription).WithMany(p => p.Payments)
                .HasForeignKey(d => d.SubscriptionId)
                .HasConstraintName("payments_ibfk_2");
        });

        modelBuilder.Entity<Rating>(entity =>
        {
            entity.HasKey(e => e.RatingId).HasName("PRIMARY");

            entity.ToTable("ratings");

            entity.HasIndex(e => e.ChefId, "fk_chef_rating");

            entity.HasIndex(e => e.MealId, "fk_meal_rating");

            entity.HasIndex(e => e.UserId, "fk_user_rating");

            entity.Property(e => e.RatingId).HasColumnName("rating_id");
            entity.Property(e => e.ChefId).HasColumnName("chef_id");
            entity.Property(e => e.MealId).HasColumnName("meal_id");
            entity.Property(e => e.Rating1).HasColumnName("rating");
            entity.Property(e => e.ReviewComment)
                .HasColumnType("text")
                .HasColumnName("review_comment");
            entity.Property(e => e.ReviewDate)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("review_date");
            entity.Property(e => e.UserId).HasColumnName("user_id");

            entity.HasOne(d => d.Chef).WithMany(p => p.Ratings)
                .HasForeignKey(d => d.ChefId)
                .HasConstraintName("fk_chef_rating");

            entity.HasOne(d => d.Meal).WithMany(p => p.Ratings)
                .HasForeignKey(d => d.MealId)
                .HasConstraintName("fk_meal_rating");

            entity.HasOne(d => d.User).WithMany(p => p.Ratings)
                .HasForeignKey(d => d.UserId)
                .HasConstraintName("fk_user_rating");
        });

        modelBuilder.Entity<Signup>(entity =>
        {
            entity.HasKey(e => e.Email).HasName("PRIMARY");

            entity.ToTable("signup");

            entity.Property(e => e.Email).HasColumnName("email");
            entity.Property(e => e.ConfirmPass)
                .HasMaxLength(255)
                .HasColumnName("confirm_pass");
            entity.Property(e => e.Name)
                .HasMaxLength(100)
                .HasColumnName("name");
            entity.Property(e => e.Password)
                .HasMaxLength(255)
                .HasColumnName("password");
            entity.Property(e => e.PhoneNumber)
                .HasMaxLength(10)
                .HasColumnName("phone_number");
            entity.Property(e => e.Role)
                .HasColumnType("enum('Customer','Chef')")
                .HasColumnName("role");
        });

        modelBuilder.Entity<Subscription>(entity =>
        {
            entity.HasKey(e => e.SubscriptionId).HasName("PRIMARY");

            entity.ToTable("subscriptions");

            entity.HasIndex(e => e.UserId, "fk_user");

            entity.Property(e => e.SubscriptionId).HasColumnName("subscription_id");
            entity.Property(e => e.CreatedAt)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("created_at");
            entity.Property(e => e.MealCountPerWeek).HasColumnName("meal_count_per_week");
            entity.Property(e => e.PlanType)
                .HasColumnType("enum('weekly','monthly')")
                .HasColumnName("plan_type");
            entity.Property(e => e.Price)
                .HasPrecision(10)
                .HasColumnName("price");
            entity.Property(e => e.Status)
                .HasDefaultValueSql("'active'")
                .HasColumnType("enum('active','paused','canceled')")
                .HasColumnName("status");
            entity.Property(e => e.SubscriptionEndDate)
                .HasColumnType("date")
                .HasColumnName("subscription_end_date");
            entity.Property(e => e.SubscriptionStartDate)
                .HasColumnType("date")
                .HasColumnName("subscription_start_date");
            entity.Property(e => e.UpdatedAt)
                .ValueGeneratedOnAddOrUpdate()
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("updated_at");
            entity.Property(e => e.UserId).HasColumnName("user_id");

            entity.HasOne(d => d.User).WithMany(p => p.Subscriptions)
                .HasForeignKey(d => d.UserId)
                .HasConstraintName("fk_user");
        });

        modelBuilder.Entity<TempUser>(entity =>
        {
            entity.HasKey(e => e.UserId).HasName("PRIMARY");

            entity.ToTable("temp_users");

            entity.Property(e => e.UserId).HasColumnName("user_id");
            entity.Property(e => e.CreatedAt)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("created_at");
            entity.Property(e => e.DietaryPreferences)
                .HasColumnType("text")
                .HasColumnName("dietary_preferences");
            entity.Property(e => e.Email)
                .HasMaxLength(255)
                .HasColumnName("email");
            entity.Property(e => e.Name)
                .HasMaxLength(100)
                .HasColumnName("name");
            entity.Property(e => e.PhoneNumber)
                .HasMaxLength(10)
                .HasColumnName("phone_number");
            entity.Property(e => e.ProfilePicture)
                .HasMaxLength(255)
                .HasColumnName("profile_picture");
            entity.Property(e => e.UpdatedAt)
                .ValueGeneratedOnAddOrUpdate()
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("updated_at");
        });

        modelBuilder.Entity<User>(entity =>
        {
            entity.HasKey(e => e.UserId).HasName("PRIMARY");

            entity.ToTable("users");

            entity.HasIndex(e => e.Email, "fk_email");

            entity.Property(e => e.UserId).HasColumnName("user_id");
            entity.Property(e => e.CreatedAt)
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("created_at");
            entity.Property(e => e.DietaryPreferences)
                .HasColumnType("text")
                .HasColumnName("dietary_preferences");
            entity.Property(e => e.Email).HasColumnName("email");
            entity.Property(e => e.Name)
                .HasMaxLength(100)
                .HasColumnName("name");
            entity.Property(e => e.PhoneNumber)
                .HasMaxLength(10)
                .HasColumnName("phone_number");
            entity.Property(e => e.ProfilePicture)
                .HasMaxLength(255)
                .HasColumnName("profile_picture");
            entity.Property(e => e.UpdatedAt)
                .ValueGeneratedOnAddOrUpdate()
                .HasDefaultValueSql("CURRENT_TIMESTAMP")
                .HasColumnType("timestamp")
                .HasColumnName("updated_at");

            entity.HasOne(d => d.EmailNavigation).WithMany(p => p.Users)
                .HasForeignKey(d => d.Email)
                .HasConstraintName("fk_email");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
