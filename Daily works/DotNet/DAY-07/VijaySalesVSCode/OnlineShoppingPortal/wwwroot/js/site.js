// Please see documentation at https://learn.microsoft.com/aspnet/core/client-side/bundling-and-minification
// for details on configuring this project to bundle and minify static web assets.

// Write your JavaScript code.

function drawBarChart() {

    // data sample for the chart
    let data = {
        labels: ['Mumbai', 'Pune',
            'IACSD', 'Sunbeam',
            'Trivendram'],
        datasets: [{
            label: 'Revenue Bar Chart',
            data: [12, 17, 3, 8, 2],
            backgroundColor: 'rgba(70, 192, 192, 0.6)',
            borderColor: 'rgba(150, 100, 255, 1)',
            borderWidth: 1
        }]
    };

    // Configuration options for the chart
    let options = {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    };

    // Get the canvas element
    let ctx = document.getElementById('canvas').getContext('2d');

    // Create the bar chart
    let myBarChart = new Chart(ctx, {
        type: 'bar',
        data: data,
        options: options
    });
}