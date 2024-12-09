import { useEffect } from "react";
import { useState } from "react";
import { getAllProducts } from "./services/ProductServiec";

export function Home() {

    const [products, setProducts] = useState([]);
    const getProductsData = async () => {
        const data = await getAllProducts();
        console.log(data);
        setProducts(data);
    }

    useEffect(() => {
        getProductsData();
    }, []);

    return (
        <div>
            <div>
                <h1>Welcome to home</h1>
                <p>This is home</p>
            </div>
            <div>
                <table>
                    <thead>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Description</th>
                        <th>Quantity</th>
                        <th>Actions</th>
                    </thead>
                    <tbody>
                        {
                            products.map(() => {
                                return (
                                    <tr>
                                        <td>{p.id}</td>
                                        <td>{p.name}</td>
                                        <td>{p.price}</td>
                                        <td>{p.description}</td>
                                        <td>{p.quantity}</td>
                                        <td>
                                            <button>Delete</button> <button>Edit</button>
                                        </td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )
}













// import { Component } from "react";
// import  "./assets/styles.css";
// import { getAllProducts } from "./services/ProductServiec";


// export class Home extends Component {
//     constructor() {
//         super();
//         this.state = {
//             products: []
//         }
//     }
//     render() {
//         return (
//             <div>
//                 <h1>Welcome to home</h1>
//                 <p>This is home.</p>
//                 <div>
//                     <table border={1} cellPadding={10} cellSpacing={0}>
//                         <thead>
//                             <tr>
// <th>Id</th>
// <th>Name</th>
// <th>Price</th>
// <th>Description</th>
// <th>Quantity</th>
// <th>Actions</th>
//                             </tr>
//                         </thead>
//                         <tbody>
//                             {
//                                 this.state.products.map((p)=>{
//                                     return (
// <tr>
//     <td>{p.id}</td>
//     <td>{p.name}</td>
//     <td>{p.price}</td>
//     <td>{p.description}</td>
//     <td>{p.quantity}</td>
//      <td>
//          <button>Delete</button> <button>Edit</button>
//      </td>
// </tr>
//                                     )
//                                 })
//                             }
//                         </tbody>
//                     </table>
//                 </div>
//                 {
//                     this.state.products.length > 0 ?
//                         this.state.products.map((p) => {
//                             return (
//                                 <div className="card">
//                                     <div className="card-header">{`${p.name}, Price: Rs.${p.price}`}</div>
//                                     <div className="card-body">{p.description}</div>
//                                     <div className="card-footer">No. of items: {p.quantity}</div>
//                                 </div>
//                             )
//                         })
//                         : <h2>No Products found</h2>
//                 }
//             </div>
//         )
//     }
//     async componentDidMount() {
//         const data = await getAllProducts();
//         this.setState({products:data});
//     }
// }

// // export function Home(){
// //     return (
// // <div>
// //     <h1>Welcome to home</h1>
// //     <p>This is home.</p>
// // </div>
// //     )
// // }