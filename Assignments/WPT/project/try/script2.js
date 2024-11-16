let selectedRow = null;

// Fetch and display the list of books
function fetchList() {
    const xhr = new XMLHttpRequest();
    xhr.open("get", "http://localhost:3000/books/getAll", true);
    xhr.onload = function() {
        if (xhr.status === 200) {
            const obj = JSON.parse(xhr.responseText);
            const table = document.getElementById("itemList").getElementsByTagName('tbody')[0];
            table.innerHTML = ""; // Clear existing rows
            obj.forEach(insertNewRecord);
        }
    };
    xhr.send();
}

// Insert a new record in the table
function insertNewRecord(data) {
    var table = document.getElementById("itemList").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);

    newRow.insertCell(0).innerHTML = data.id;
    newRow.insertCell(1).innerHTML = data.title;
    newRow.insertCell(2).innerHTML = data.description;
    newRow.insertCell(3).innerHTML = `<a class="act" onClick="onEdit(this)">
                                            <i class="fa-solid fa-pen-to-square"></i> 
                                        </a> 
                                        <a class="act" onClick="onDelete(this)">
                                            <i class="fa-solid fa-trash"></i> 
                                        </a>`;

}

// Send POST request to add a new book
function xhrFunction() {
    const data = readFormData();
    const xhr = new XMLHttpRequest();
    xhr.open("post", "http://localhost:3000/books/save", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify(data));
    xhr.onload = function() {
        if (xhr.status === 200) {
            fetchList();
            resetForm();
        }
    };
}

// Send PUT request to update an existing book
function updateRecordOnServer(formData) {
    const xhr = new XMLHttpRequest();
    xhr.open("put", `http://localhost:3000/books/update/${formData.id}`, true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify(formData));
    xhr.onload = function() {
        if (xhr.status === 200) {
            fetchList();
            resetForm();
        }
    };
}

// Handle form submission
function onFormSubmit() {
    if (validate()) {
        const formData = readFormData();
        if (selectedRow == null) {
            xhrFunction(); // POST request for new entry
        } else {
            updateRecordOnServer(formData); // PUT request for update
        }
    }
}

// Read data from the form
function readFormData() {
    return {
        id: document.getElementById("id").value,
        title: document.getElementById("title").value,
        description: document.getElementById("description").value
    };
}

// Reset form fields
function resetForm() {
    document.getElementById("id").value = "";
    document.getElementById("title").value = "";
    document.getElementById("description").value = "";
    selectedRow = null;
}

// Validate form data
function validate() {
    let isValid = true;
    if (document.getElementById("id").value == "") {
        isValid = false;
        alert("ID is required.");
    }
    if (document.getElementById("title").value == "") {
        isValid = false;
        alert("Title is required.");
    }
    if (document.getElementById("description").value == "") {
        isValid = false;
        alert("Description is required.");
    }
    return isValid;
}

// Edit an existing row
function onEdit(td) {
    selectedRow = td.parentElement.parentElement;
    document.getElementById("id").value = selectedRow.cells[0].innerHTML;
    document.getElementById("title").value = selectedRow.cells[1].innerHTML;
    document.getElementById("description").value = selectedRow.cells[2].innerHTML;
}

// Delete a record from server and table
function deleteRecordOnServer(id) {
    const xhr = new XMLHttpRequest();
    xhr.open("delete", `http://localhost:3000/books/delete/${id}`, true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onload = function() {
        if (xhr.status === 200) {
            fetchList();
        }
    };
    xhr.send();
}

// Handle delete action on the UI
function onDelete(td) {
    if (confirm("Are you sure you want to delete this item?")) {
        row = td.parentElement.parentElement;
        const id = row.cells[0].innerHTML;
        deleteRecordOnServer(id);
        document.getElementById("itemList").deleteRow(row.rowIndex);
        resetForm();
    }
}

// Fetch the list when the page loads
window.onload = fetchList;
