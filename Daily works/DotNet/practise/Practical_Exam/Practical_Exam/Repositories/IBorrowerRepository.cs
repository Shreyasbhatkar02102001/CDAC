using Practical_Exam.Models;

namespace Practical_Exam.Repositories
{
    //IBorrowerRepository: Add, Update, Delete, GetBorrowerById, GetAllBorrowers.
    public interface IBorrowerRepository
    {
        public List<Borrower> GetAllBooks(Borrower borrower);

        public Borrower GetBorrowerById(int id);

        public void Add(Borrower borrower);

        public void Update(Borrower borrower);

        public void Delete(int id);
    }
}
