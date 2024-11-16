import { createConnectionObject } from "../config/Dbconfig.js";


const connection = createConnectionObject();

export function saveEmployee(request, response) {
    try {
        const data = request.body; // { id: 11, name: '', phone: '', salary: '', department: '' }
        const query = `INSERT INTO employee (id, name, salary, department, phone) VALUES (${data.id}, '${data.name}', ${data.salary}, '${data.department}', '${data.phone}');`;

        connection.query(query, (error, result) => {
            if (error) {
                console.error(error);
                response.status(500).send({ message: "Error registering employee" });
            } else {
                response.status(201).send({ message: "Employee registered successfully"});
            }
        });
    } catch (error) {
        console.error(error);
        response.status(500).send({ message: "Error registering employee" });
    }
}