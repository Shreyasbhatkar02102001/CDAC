using contact_us_web_api.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace contact_us_web_api.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ContactUsController : ControllerBase
    {
        private readonly DotnetProjectContext context;

        public ContactUsController(DotnetProjectContext context)
        {
            this.context = context;
        }

        [HttpGet]
        public async Task<ActionResult<List<ContactU>>> GetContactUs()
        {
            var data = await context.ContactUs.ToListAsync();
            return Ok(data);
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<ContactU>> GetContactById(int id)
        {
            var contact = await context.ContactUs.FindAsync(id);
            if (contact == null)
            {
                return NotFound();
            }
            return Ok(contact);
            //return contact;
        }

        [HttpPost]
        public async Task<ActionResult<ContactU>> CreateContact(ContactU con)
        {
            await context.ContactUs.AddAsync(con);
            await context.SaveChangesAsync();
            return Ok(con);
        }

        [HttpPut("{id}")]
        public async Task<ActionResult<ContactU>> UpdateContact(int id, ContactU con)
        {
            if (id != con.ContactId )
            {
                return BadRequest();
            } 
            context.Entry(con).State = EntityState.Modified;
            await context.SaveChangesAsync();
            return Ok(con);
        }

        [HttpDelete("{id}")]
        public async Task<ActionResult<ContactU>> DeleteContact(int id)
        {
            var con = await context.ContactUs.FindAsync(id);
            if (con == null)
            {
                return NotFound();
            }
            context.ContactUs.Remove(con);
            await context.SaveChangesAsync();
            return Ok();
        }
    }
}
