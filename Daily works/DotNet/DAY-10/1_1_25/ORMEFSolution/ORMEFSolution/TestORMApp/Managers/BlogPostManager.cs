using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestORMApp.Contexts;
using TestORMApp.Entities;

namespace TestORMApp.Managers
{
    public class BlogPostManager
    {

        // CREATE operation
        public static void CreateBlogPost()
        {
            using (var context = new BlogContext())
            {
                var blogPost = new BlogPost
                {
                    Title = "My first blog post",
                    Content = "This is the content of my first blog post.",
                    CreatedAt = DateTime.Now,
                    UpdatedAt = DateTime.Now
                };

                context.BlogPosts.Add(blogPost);
                context.SaveChanges();
                Console.WriteLine("Blog post created!");
            }
        }

        // READ operation
        public static void ReadBlogPosts()
        {
            using (var context = new BlogContext())
            {
                var blogPosts = context.BlogPosts.ToList();
                foreach (var post in blogPosts)
                {
                    Console.WriteLine($"ID: {post.Id}, Title: {post.Title}, Created At: {post.CreatedAt}");
                }
            }
        }

        // UPDATE operation
        public static void UpdateBlogPost()
        {
            Console.WriteLine("Enter the ID of the blog post to update: ");
            var id = int.Parse(Console.ReadLine());

            using (var context = new BlogContext())
            {
                var blogPost = context.BlogPosts.Find(id);
                if (blogPost != null)
                {
                    Console.WriteLine($"Current Title: {blogPost.Title}");
                    Console.WriteLine("Enter the new title: ");
                    blogPost.Title = Console.ReadLine();

                    blogPost.UpdatedAt = DateTime.Now;
                    context.SaveChanges();
                    Console.WriteLine("Blog post updated!");
                }
                else
                {
                    Console.WriteLine("Blog post not found!");
                }
            }
        }

        // DELETE operation
        public static void DeleteBlogPost()
        {
            Console.WriteLine("Enter the ID of the blog post to delete: ");
            var id = int.Parse(Console.ReadLine());

            using (var context = new BlogContext())
            {
                var blogPost = context.BlogPosts.Find(id);
                if (blogPost != null)
                {
                    context.BlogPosts.Remove(blogPost);
                    context.SaveChanges();
                    Console.WriteLine("Blog post deleted!");
                }
                else
                {
                    Console.WriteLine("Blog post not found!");
                }
            }
        }
    }
}

