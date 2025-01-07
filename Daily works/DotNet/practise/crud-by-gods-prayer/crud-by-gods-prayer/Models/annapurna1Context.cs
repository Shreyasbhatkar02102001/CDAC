using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata;

namespace crud_by_gods_prayer.Models
{
    public partial class annapurna1Context : DbContext
    {
        public annapurna1Context()
        {
        }

        public annapurna1Context(DbContextOptions<annapurna1Context> options)
            : base(options)
        {
        }

        public virtual DbSet<Dietary> Dietaries { get; set; } = null!;
        public virtual DbSet<Feedback> Feedbacks { get; set; } = null!;
        public virtual DbSet<Menumanagement> Menumanagements { get; set; } = null!;
        public virtual DbSet<Subscription> Subscriptions { get; set; } = null!;
        public virtual DbSet<Zerowaste> Zerowastes { get; set; } = null!;

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
                optionsBuilder.UseMySQL("Server=localhost;Database=annapurna1;User=root;Password=cdac;");
            }
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Dietary>(entity =>
            {
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

            modelBuilder.Entity<Zerowaste>(entity =>
            {
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
}
