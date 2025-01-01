using Repositories.Connected;
using Repositories.Interfaces;
using Services.Interfaces;
using Services.Implementations;


var builder = WebApplication.CreateBuilder(args);
// Add services to the container.
//
//builder.Services.AddSingleton<IProductService, ProductService>();
//builder.Services.AddTransient<IProductService, ProductService>();
//builder.Services.AddScoped<IDataRepository, JsonDataRespository>();
//builder.Services.AddScoped<IDataRepository, DatabaseRepository>();
builder.Services.AddScoped<IProductRepository, ProductRepository>();
builder.Services.AddScoped<IProductService, ProductService>();
builder.Services.AddControllers();
var app = builder.Build();

// Configure the HTTP request pipeline.
app.UseAuthorization();
app.MapControllers();
app.Run();
