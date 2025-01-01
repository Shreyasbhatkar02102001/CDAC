using CRUD_student_MVC.Models;
using CRUD_student_MVC.Repositories;
using CRUD_student_MVC.Services.Interfaces;

namespace CRUD_student_MVC.Services.Implementation
{
    public class StudentService : IStudentService
    {
        public IStudentRepository studentRepository;

        public StudentService(IStudentRepository studentRepo)
        {
            studentRepository = studentRepo;
        }

        public void add(Student student)
        {
            studentRepository.add(student);
        }

        public void deleteById(int id)
        {
            studentRepository.deleteById(id);
        }

        public List<Student> getAll()
        {
            return studentRepository.getAll();
        }

        public Student getById(int id)
        {
            return studentRepository.getById(id);
        }

        public void update(Student student)
        {
            studentRepository.update(student);
        }
    }
}
