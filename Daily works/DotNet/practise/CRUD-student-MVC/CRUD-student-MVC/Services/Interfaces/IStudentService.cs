﻿using CRUD_student_MVC.Models;

namespace CRUD_student_MVC.Services.Interfaces
{
    public interface IStudentService
    {
        public List<Student> getAll();
        public Student getById(int id);
        public void add(Student student);
        public void update(Student student);
        public void deleteById(int id);
    }
}
