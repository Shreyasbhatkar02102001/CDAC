import axios from "axios";
import { PRODUCTS_API_URL } from "../constants/ApiConstants";
import { getToken } from "./AdminService";

export function getAllProducts(){
    return axios.get(`${PRODUCTS_API_URL}/getAll`,{headers:{Authorization:`Bearer ${getToken()}`}});
}

export function saveProduct(product){
    return axios.post(`${PRODUCTS_API_URL}/save`,product,{headers:{Authorization:`Bearer ${getToken()}`}});
}

export function removeProduct(id){
    return axios.delete(`${PRODUCTS_API_URL}/remove/${id}`,{headers:{Authorization:`Bearer ${getToken()}`}});
}

export function getProductById(id){
    return axios.get(`${PRODUCTS_API_URL}/getById/${id}`,{headers:{Authorization:`Bearer ${getToken()}`}});
}