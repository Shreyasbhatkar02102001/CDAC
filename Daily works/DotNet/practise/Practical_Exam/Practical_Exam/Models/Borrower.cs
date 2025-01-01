using Microsoft.AspNetCore.Http.HttpResults;

namespace Practical_Exam.Models
{
    //Borrower Model: Create a Borrower class with the following properties: BorrowerId, Name, Address, ContactInfo, CreatedDate, UpdatedDate
    public class Borrower
    {
        public int BorrowerId { get; set; }

        public string Name { get; set; }

        public string Address { get; set; }

        public int ContactInfo { get; set; }

        public DateTime CreatedDate { get; set; } = DateTime.Now;

        public DateTime UpdatedDate { get; set; } = DateTime.Now;
    }
}

// create table Borrower( BorrowerId int auto_increment primary key, Name varchar(50) not null , Address varchar(100) not null, ContactInfo int not null, CreatedDate datetime current_timestamp, UpdatedDate datetime current_timestamp on update current_timstamp);
