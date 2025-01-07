using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace gods_is_only_my_hope.Models;

public partial class Annapurna1Context : DbContext
{
    public Annapurna1Context()
    {
    }

    public Annapurna1Context(DbContextOptions<Annapurna1Context> options)
        : base(options)
    {
    }

    public virtual DbSet<Dietary> Dietaries { get; set; }

    public virtual DbSet<Feedback> Feedbacks { get; set; }

    public virtual DbSet<Menumanagement> Menumanagements { get; set; }

    public virtual DbSet<Subscription> Subscriptions { get; set; }

    public virtual DbSet<User> Users { get; set; }

    public virtual DbSet<Zerowaste> Zerowastes { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySQL("Server=localhost;Database=annapurna1;User=root;Password=cdac;");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
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

        modelBuilder.Entity<Feedback>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("feedbacks");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.ChefName)
                .HasMaxLength(255)
                .HasColumnName("chef_name");
            entity.Property(e => e.Feedback1)
                .HasMaxLength(1000)
                .HasColumnName("feedback");
        });

        modelBuilder.Entity<Menumanagement>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("menumanagement");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Description)
                .HasMaxLength(20)
                .HasColumnName("description");
            entity.Property(e => e.Name)
                .HasMaxLength(10)
                .HasColumnName("name");
            entity.Property(e => e.Price).HasColumnName("price");
        });

        modelBuilder.Entity<Subscription>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("subscription");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.CustomerName)
                .HasMaxLength(255)
                .HasColumnName("customer_name");
            entity.Property(e => e.Plan)
                .HasMaxLength(255)
                .HasColumnName("plan");
            entity.Property(e => e.Status)
                .HasMaxLength(255)
                .HasColumnName("status");
        });

        modelBuilder.Entity<User>(entity =>
        {
            entity.HasKey(e => e.UserId).HasName("PRIMARY");

            entity.ToTable("users");

            entity.HasIndex(e => e.Email, "email").IsUnique();

            entity.HasIndex(e => e.PhoneNumber, "phone_number").IsUnique();

            entity.Property(e => e.UserId).HasColumnName("user_id");
            entity.Property(e => e.Email).HasColumnName("email");
            entity.Property(e => e.Name)
                .HasMaxLength(100)
                .HasColumnName("name");
            entity.Property(e => e.PhoneNumber)
                .HasMaxLength(15)
                .HasColumnName("phone_number");
        });

        modelBuilder.Entity<Zerowaste>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("zerowaste");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.DonatedTo)
                .HasMaxLength(255)
                .HasColumnName("donated_to");
            entity.Property(e => e.Name)
                .HasMaxLength(255)
                .HasColumnName("name");
            entity.Property(e => e.Quantity)
                .HasMaxLength(255)
                .HasColumnName("quantity");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
