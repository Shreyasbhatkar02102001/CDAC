﻿using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestORMApp.Entities;

namespace TestORMApp.Contexts
{
    public class HRDbContext : DbContext
    {
        public DbSet<Employee> Employees { get; set; }
        public DbSet<Department> Departments { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySql("Server=localhost;Database=BlogDb;User=root;Password=cdac;",
                new MySqlServerVersion(new Version(8, 0, 21))); 
            // Adjust version as needed
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            // Setting up Foreign Key
            modelBuilder.Entity<Employee>()
                .HasOne(e => e.Department)
                .WithMany(d => d.Employees)
                .HasForeignKey(e => e.DepartmentId)
                .OnDelete(DeleteBehavior.Cascade);
        }
    }
}
