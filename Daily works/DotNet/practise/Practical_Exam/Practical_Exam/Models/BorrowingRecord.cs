using System;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data;
using Org.BouncyCastle.Asn1.Mozilla;

namespace Practical_Exam.Models
{
    //BorrowingRecord Model: RecordId, BookId(foreign key), BorrowerId(foreign key), BorrowDate, ReturnDate(nullable for ongoing borrowings)

    public class BorrowingRecord
    {
        public int RecordId { get; set; }

        public int BookId { get; set; } ForeignKeyAttribute ForeignKeyAttribute { get; set; }

        public DateTime BorrowDate { get; set; } = DateTime.Now;

        public DateTime ReturnDate {  get; set; } = DateTime.Now;



    }
}

//  create table BorrowingRecord( RecordId int auto_incremnet primary key, BorrowerId int foreign key() , BorrowDate datetime current_timestamp on update current_timestamp, ReturnDate datetime current_timestamp);
