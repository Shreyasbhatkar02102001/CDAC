// api.js
export const fetchBooks = () => {
    return $.ajax({
        url: 'http://127.0.0.1:9600/books',
        method: 'GET'
    });
};

export const addBook = (book) => {
    const formData = new FormData();
    formData.append('id', book.id);
    formData.append('title', book.title);
    formData.append('description', book.description);
    formData.append('image', book.image);

    return $.ajax({
        url: 'http://127.0.0.1:9600/books',
        method: 'POST',
        data: formData,
        processData: false,
        contentType: false
    });
};

export const deleteBook = (id) => {
    return $.ajax({
        url: `http://127.0.0.1:9600/books/${id}`,
        method: 'DELETE'
    });
};

export const fetchBookById = (id) => {
    return $.ajax({
        url: `http://127.0.0.1:9600/books/${id}`,
        method: 'GET'
    });
};
