using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace trial.Models;

public partial class Emps1Context : DbContext
{
    public Emps1Context()
    {
    }

    public Emps1Context(DbContextOptions<Emps1Context> options)
        : base(options)
    {
    }

    public virtual DbSet<Employee> Employees { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySQL("Server=localhost;Database=emps1;User=root;Password=cdac;");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Employee>(entity =>
        {
            entity.HasKey(e => e.Empid).HasName("PRIMARY");

            entity.ToTable("employees");

            entity.HasIndex(e => e.Email, "UKj9xgmd0ya5jmus09o0b8pqrpb").IsUnique();

            entity.Property(e => e.Empid).HasColumnName("empid");
            entity.Property(e => e.CreatedOn)
                .HasColumnType("date")
                .HasColumnName("created_on");
            entity.Property(e => e.Department)
                .HasMaxLength(255)
                .HasColumnName("department");
            entity.Property(e => e.Email).HasColumnName("email");
            entity.Property(e => e.Fname)
                .HasMaxLength(255)
                .HasColumnName("fname");
            entity.Property(e => e.Lname)
                .HasMaxLength(255)
                .HasColumnName("lname");
            entity.Property(e => e.Location)
                .HasMaxLength(255)
                .HasColumnName("location");
            entity.Property(e => e.Salary).HasColumnName("salary");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
