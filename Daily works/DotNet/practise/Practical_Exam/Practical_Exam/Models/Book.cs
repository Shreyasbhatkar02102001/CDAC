using Microsoft.AspNetCore.Http.HttpResults;
using Org.BouncyCastle.Asn1.Mozilla;

namespace Practical_Exam.Models
{
    //Book Model: Create a Book class with the following properties: BookId, Title, Author, Category, IsAvailable(boolean), CreatedDate, UpdatedDate
    public class Book
    {
        public int BookId { get; set; }
        
        public string Title { get; set; }

        public string Author {  get; set; }

        public string Category { get; set; }

        public bool IsAvailable { get; set; }

        public DateTime CreatedDate {  get; set; } = DateTime.Now;

        public DateTime UpdatedDate {  get; set; } = DateTime.Now;
    }
}

// create table Book( BookId int auto_increment primary key, Title varchar(50) not null, Author varchar(50) not null, Category varchar(50) not null, IsAvailable char(1) not null, CreatedDate datetime current_timestamp, UpdatedDate datetime current_timestamp on update current_timstamp);
