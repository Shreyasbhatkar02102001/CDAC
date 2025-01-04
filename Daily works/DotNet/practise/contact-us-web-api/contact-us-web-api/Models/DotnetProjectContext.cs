using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace contact_us_web_api.Models;

public partial class DotnetProjectContext : DbContext
{
    public DotnetProjectContext()
    {
    }

    public DotnetProjectContext(DbContextOptions<DotnetProjectContext> options)
        : base(options)
    {
    }

    public virtual DbSet<ContactU> ContactUs { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySQL("Server=localhost;Database=dotnetProject;User=root;Password=cdac;");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
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

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
