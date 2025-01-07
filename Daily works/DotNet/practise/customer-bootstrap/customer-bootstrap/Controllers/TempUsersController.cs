using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using customer_bootstrap.Models;

namespace customer_bootstrap.Controllers
{
    public class TempUsersController : Controller
    {
        private readonly DotnetProjectContext _context;

        public TempUsersController(DotnetProjectContext context)
        {
            _context = context;
        }

        public async Task<IActionResult> Prodashboard()
        {
            // Example: Fetch user data asynchronously
            var user = await _context.TempUsers.FindAsync(1); // Replace 1 with the actual user ID

            if (user == null)
            {
                return NotFound();
            }

            return View(user);
        }


        public IActionResult Dashboard()
        {
            var tempUser = new TempUser
            {
                UserId = 1,
                Name = "Annapurna",
                Email = "Annapurna@example.com",
                PhoneNumber = "+91 9870000000",
                ProfilePicture = "https://th.bing.com/th/id/OIP.xo-BCC1ZKFpLL65D93eHcgHaGe?w=250&h=219&c=7&r=0&o=5&pid=1.7",
                CreatedAt = DateTime.Now,
                UpdatedAt = DateTime.Now
            };

            return View(tempUser);
        }

        // GET: TempUsers
        public async Task<IActionResult> Index()
        {
            return View(await _context.TempUsers.ToListAsync());
        }

        // GET: TempUsers/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var tempUser = await _context.TempUsers
                .FirstOrDefaultAsync(m => m.UserId == id);
            if (tempUser == null)
            {
                return NotFound();
            }

            return View(tempUser);
        }

        // GET: TempUsers/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: TempUsers/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("UserId,Name,Email,PhoneNumber,DietaryPreferences,ProfilePicture,CreatedAt,UpdatedAt")] TempUser tempUser)
        {
            if (ModelState.IsValid)
            {
                _context.Add(tempUser);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(tempUser);
        }

        // GET: TempUsers/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var tempUser = await _context.TempUsers.FindAsync(id);
            if (tempUser == null)
            {
                return NotFound();
            }
            return View(tempUser);
        }

        // POST: TempUsers/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("UserId,Name,Email,PhoneNumber,DietaryPreferences,ProfilePicture,CreatedAt,UpdatedAt")] TempUser tempUser)
        {
            if (id != tempUser.UserId)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(tempUser);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!TempUserExists(tempUser.UserId))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            return View(tempUser);
        }

        // GET: TempUsers/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var tempUser = await _context.TempUsers
                .FirstOrDefaultAsync(m => m.UserId == id);
            if (tempUser == null)
            {
                return NotFound();
            }

            return View(tempUser);
        }

        // POST: TempUsers/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var tempUser = await _context.TempUsers.FindAsync(id);
            if (tempUser != null)
            {
                _context.TempUsers.Remove(tempUser);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool TempUserExists(int id)
        {
            return _context.TempUsers.Any(e => e.UserId == id);
        }
    }
}
