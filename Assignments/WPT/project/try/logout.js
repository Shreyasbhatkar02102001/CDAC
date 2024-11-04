function logout() {
    localStorage.removeItem("fname");
    localStorage.removeItem("email");
    window.location.href ="signin.html";
}