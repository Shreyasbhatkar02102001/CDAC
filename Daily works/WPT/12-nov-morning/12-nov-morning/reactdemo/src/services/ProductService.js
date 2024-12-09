import { PRODUCTS_API_URL } from "../constants/ApiConstants";

export async function getAllProducts(){
    let products = [];
    try {
        const response = await fetch(`${PRODUCTS_API_URL}/getAll`);
        const data = await response.json();
        products = data;
    } catch (error) {
        console.log(error);
    }
    finally{
        return products;
    }
    
}
