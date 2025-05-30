﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using customer_bootstrap.Models;

namespace customer_bootstrap.Controllers
{
    public class DietariesController : Controller
    {
        private readonly DotnetProjectContext _context;

        public DietariesController(DotnetProjectContext context)
        {
            _context = context;
        }

        // GET: Dietaries
        public async Task<IActionResult> Index()
        {
            return View(await _context.Dietaries.ToListAsync());
        }

        // GET: Dietaries/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var dietary = await _context.Dietaries
                .FirstOrDefaultAsync(m => m.DietaryId == id);
            if (dietary == null)
            {
                return NotFound();
            }

            return View(dietary);
        }

        // GET: Dietaries/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Dietaries/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("DietaryId,UserName,DietaryPreference,Description")] Dietary dietary)
        {
            if (ModelState.IsValid)
            {
                _context.Add(dietary);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(dietary);
        }

        // GET: Dietaries/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var dietary = await _context.Dietaries.FindAsync(id);
            if (dietary == null)
            {
                return NotFound();
            }
            return View(dietary);
        }

        // POST: Dietaries/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("DietaryId,UserName,DietaryPreference,Description")] Dietary dietary)
        {
            if (id != dietary.DietaryId)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(dietary);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!DietaryExists(dietary.DietaryId))
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
            return View(dietary);
        }

        // GET: Dietaries/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var dietary = await _context.Dietaries
                .FirstOrDefaultAsync(m => m.DietaryId == id);
            if (dietary == null)
            {
                return NotFound();
            }

            return View(dietary);
        }

        // POST: Dietaries/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var dietary = await _context.Dietaries.FindAsync(id);
            if (dietary != null)
            {
                _context.Dietaries.Remove(dietary);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool DietaryExists(int id)
        {
            return _context.Dietaries.Any(e => e.DietaryId == id);
        }
    }
}
