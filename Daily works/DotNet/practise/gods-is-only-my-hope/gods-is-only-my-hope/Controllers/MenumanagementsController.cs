using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using gods_is_only_my_hope.Models;

namespace gods_is_only_my_hope.Controllers
{
    public class MenumanagementsController : Controller
    {
        private readonly Annapurna1Context _context;

        public MenumanagementsController(Annapurna1Context context)
        {
            _context = context;
        }

        // GET: Menumanagements
        public async Task<IActionResult> Index()
        {
            return View(await _context.Menumanagements.ToListAsync());
        }

        // GET: Menumanagements/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var menumanagement = await _context.Menumanagements
                .FirstOrDefaultAsync(m => m.Id == id);
            if (menumanagement == null)
            {
                return NotFound();
            }

            return View(menumanagement);
        }

        // GET: Menumanagements/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Menumanagements/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Description,Name,Price")] Menumanagement menumanagement)
        {
            if (ModelState.IsValid)
            {
                _context.Add(menumanagement);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(menumanagement);
        }

        // GET: Menumanagements/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var menumanagement = await _context.Menumanagements.FindAsync(id);
            if (menumanagement == null)
            {
                return NotFound();
            }
            return View(menumanagement);
        }

        // POST: Menumanagements/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,Description,Name,Price")] Menumanagement menumanagement)
        {
            if (id != menumanagement.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(menumanagement);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!MenumanagementExists(menumanagement.Id))
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
            return View(menumanagement);
        }

        // GET: Menumanagements/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var menumanagement = await _context.Menumanagements
                .FirstOrDefaultAsync(m => m.Id == id);
            if (menumanagement == null)
            {
                return NotFound();
            }

            return View(menumanagement);
        }

        // POST: Menumanagements/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var menumanagement = await _context.Menumanagements.FindAsync(id);
            if (menumanagement != null)
            {
                _context.Menumanagements.Remove(menumanagement);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool MenumanagementExists(int id)
        {
            return _context.Menumanagements.Any(e => e.Id == id);
        }
    }
}
