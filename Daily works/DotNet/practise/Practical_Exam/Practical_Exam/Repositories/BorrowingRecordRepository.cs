using Practical_Exam.Models;

namespace Practical_Exam.Repositories
{
    public class BorrowingRecordRepository : IBorrowingRecordRepository
    {
        public void AddBorrowingRecord(BorrowingRecord record)
        {
            throw new NotImplementedException();
        }

        public BorrowingRecord GetBorrowingHistoryByBorrower(int borrowerId)
        {
            throw new NotImplementedException();
        }

        public void MarkAsReturned(int borrowerId)
        {
            throw new NotImplementedException();
        }
    }
}
