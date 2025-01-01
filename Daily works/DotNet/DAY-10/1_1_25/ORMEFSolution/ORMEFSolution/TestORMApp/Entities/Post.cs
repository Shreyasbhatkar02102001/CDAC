using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestORMApp.Entities
{
    public class Post
    {
        public int PostId { get; set; }
        public string PostTitle { get; set; }
        public Blog Blog { get; set; }
    }
}
