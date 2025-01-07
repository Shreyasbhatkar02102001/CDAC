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
    public class ZerowastesController : Controller
    {
        private readonly Annapurna1Context _context;

        public ZerowastesController(Annapurna1Context context)
        {
            _context = context;
        }

        // GET: Zerowastes
        public async Task<IActionResult> Index()
        {
            return View(await _context.Zerowastes.ToListAsync());
        }

        // GET: Zerowastes/Details/5
        public async Task<IActionResult> Details(long? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var zerowaste = await _context.Zerowastes
                .FirstOrDefaultAsync(m => m.Id == id);
            if (zerowaste == null)
            {
                return NotFound();
            }

            return View(zerowaste);
        }

        // GET: Zerowastes/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Zerowastes/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,DonatedTo,Name,Quantity")] Zerowaste zerowaste)
        {
            if (ModelState.IsValid)
            {
                _context.Add(zerowaste);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(zerowaste);
        }

        // GET: Zerowastes/Edit/5
        public async Task<IActionResult> Edit(long? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var zerowaste = await _context.Zerowastes.FindAsync(id);
            if (zerowaste == null)
            {
                return NotFound();
            }
            return View(zerowaste);
        }

        // POST: Zerowastes/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(long id, [Bind("Id,DonatedTo,Name,Quantity")] Zerowaste zerowaste)
        {
            if (id != zerowaste.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(zerowaste);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!ZerowasteExists(zerowaste.Id))
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
            return View(zerowaste);
        }

        // GET: Zerowastes/Delete/5
        public async Task<IActionResult> Delete(long? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var zerowaste = await _context.Zerowastes
                .FirstOrDefaultAsync(m => m.Id == id);
            if (zerowaste == null)
            {
                return NotFound();
            }

            return View(zerowaste);
        }

        // POST: Zerowastes/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(long id)
        {
            var zerowaste = await _context.Zerowastes.FindAsync(id);
            if (zerowaste != null)
            {
                _context.Zerowastes.Remove(zerowaste);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool ZerowasteExists(long id)
        {
            return _context.Zerowastes.Any(e => e.Id == id);
        }
    }
}
