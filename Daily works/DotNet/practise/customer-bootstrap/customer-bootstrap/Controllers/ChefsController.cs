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
    public class ChefsController : Controller
    {
        private readonly DotnetProjectContext _context;

        public ChefsController(DotnetProjectContext context)
        {
            _context = context;
        }

        // GET: Chefs
        public async Task<IActionResult> Index()
        {
            var dotnetProjectContext = _context.Chefs.Include(c => c.EmailNavigation);
            return View(await dotnetProjectContext.ToListAsync());
        }

        // GET: Chefs/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var chef = await _context.Chefs
                .Include(c => c.EmailNavigation)
                .FirstOrDefaultAsync(m => m.ChefId == id);
            if (chef == null)
            {
                return NotFound();
            }

            return View(chef);
        }

        // GET: Chefs/Create
        public IActionResult Create()
        {
            ViewData["Email"] = new SelectList(_context.Signups, "Email", "Email");
            return View();
        }

        // POST: Chefs/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("ChefId,Name,Email,Bio,ProfilePicture,DeliveryArea,Rating,ContactInfo,CreatedAt,UpdatedAt")] Chef chef)
        {
            if (ModelState.IsValid)
            {
                _context.Add(chef);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            ViewData["Email"] = new SelectList(_context.Signups, "Email", "Email", chef.Email);
            return View(chef);
        }

        // GET: Chefs/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var chef = await _context.Chefs.FindAsync(id);
            if (chef == null)
            {
                return NotFound();
            }
            ViewData["Email"] = new SelectList(_context.Signups, "Email", "Email", chef.Email);
            return View(chef);
        }

        // POST: Chefs/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("ChefId,Name,Email,Bio,ProfilePicture,DeliveryArea,Rating,ContactInfo,CreatedAt,UpdatedAt")] Chef chef)
        {
            if (id != chef.ChefId)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(chef);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!ChefExists(chef.ChefId))
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
            ViewData["Email"] = new SelectList(_context.Signups, "Email", "Email", chef.Email);
            return View(chef);
        }

        // GET: Chefs/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var chef = await _context.Chefs
                .Include(c => c.EmailNavigation)
                .FirstOrDefaultAsync(m => m.ChefId == id);
            if (chef == null)
            {
                return NotFound();
            }

            return View(chef);
        }

        // POST: Chefs/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var chef = await _context.Chefs.FindAsync(id);
            if (chef != null)
            {
                _context.Chefs.Remove(chef);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool ChefExists(int id)
        {
            return _context.Chefs.Any(e => e.ChefId == id);
        }
    }
}
