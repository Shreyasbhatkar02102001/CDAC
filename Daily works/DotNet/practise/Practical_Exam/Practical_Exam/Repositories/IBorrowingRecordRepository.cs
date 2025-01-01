using Practical_Exam.Models;
namespace Practical_Exam.Repositories
{
//    AddBorrowingRecord, 
//GetBorrowingHistoryByBorrower,
//MarkAsReturned.

    public interface IBorrowingRecordRepository
    {
        public BorrowingRecord GetBorrowingHistoryByBorrower(int borrowerId);

        public void AddBorrowingRecord(BorrowingRecord record);

        public void MarkAsReturned(int borrowerId);
    }
}
