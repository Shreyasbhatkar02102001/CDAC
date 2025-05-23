var selectedRow = null;

function addItem() {
    if (validate()) {
        var formData = readFormData();
        if (selectedRow == null) {
            insertNewRecord(formData);
        } else {
            updateRecord(formData);
        }
        resetForm();
    }
}

function validate() {
    isValid = true;
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

function readFormData() {
    var formData = {};
    formData["id"] = document.getElementById("id").value;
    formData["title"] = document.getElementById("title").value;
    formData["description"] = document.getElementById("description").value;
    formData["image"] = URL.createObjectURL(document.getElementById("image").files[0]);
    return formData;
}

function insertNewRecord(data) {
    var table = document.getElementById("itemList").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    cell1 = newRow.insertCell(0);
    cell1.innerHTML = data.id;
    cell1 = newRow.insertCell(1);
    cell1.innerHTML = data.title;
    cell2 = newRow.insertCell(2);
    cell2.innerHTML = data.description;
    cell3 = newRow.insertCell(3);
    cell3.innerHTML = data.image ? `<img src="${data.image}" width="220" height="180">` : "";
    cell4 = newRow.insertCell(4);
    cell4.innerHTML = `<a class="act" onClick="onEdit(this)">Edit</a> 
                       <a class="act" onClick="onDelete(this)">Delete</a>`;
}

function resetForm() {
    document.getElementById("id").value = "";
    document.getElementById("title").value = "";
    document.getElementById("description").value = "";
    document.getElementById("image").value = "";
    selectedRow = null;
}

function onEdit(td) {
    selectedRow = td.parentElement.parentElement;
    document.getElementById("id").value = selectedRow.cells[0].innerHTML;
    document.getElementById("title").value = selectedRow.cells[1].innerHTML;
    document.getElementById("description").value = selectedRow.cells[2].innerHTML;
    document.getElementById("image").value = "";
}

function updateRecord(formData) {
    selectedRow.cells[0].innerHTML = formData.id;
    selectedRow.cells[1].innerHTML = formData.title;
    selectedRow.cells[2].innerHTML = formData.description;
    if (formData.image) {
        selectedRow.cells[3].innerHTML = `<img src="${formData.image}" width="220" height="180">`;
    }
}

function onDelete(td) {
    if (confirm("Are you sure you want to delete this item?")) {
        row = td.parentElement.parentElement;
        document.getElementById("itemList").deleteRow(row.rowIndex);
        resetForm();
    }
}


