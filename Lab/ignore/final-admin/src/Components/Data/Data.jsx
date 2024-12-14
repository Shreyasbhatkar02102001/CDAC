import {
    UilEstate,
    UilClipboardAlt,
    UilUsersAlt,
    UilPackage,
    UilChart,
    // UilSignOutAlt,
    // UtilUsdSquare,
    // UtilMoneyWithdrawal,
    } from "@iconscout/react-unicons";

    

    export const SidebarDateFormat = [
        {
            icon: UilEstate,
            heading: "Dashboard",
            path: "/dashboard",
        },
        {
            icon: UilClipboardAlt,
            heading: "Orders",
            path: "/orders",
        },
        {
            icon: UilUsersAlt,
            heading: "Customers",
            path: "/customers",
        },
        {
            icon: UilUsersAlt,
            heading: "Chefs",
            path: "/chefs",
        },
        {
            icon: UilPackage,
            heading: "Contact",
            path: "/contact",
        },
        {
            icon: UilChart,
            heading: "Analytics",
            path: "/analytics",
        },
    ];
    

// in this we are creating a javascript object and each object will represent an individual card
export const CardsData = [
    {
        title: "Sales",
        color: {
            background: "linear-gradient(135deg, #FFE985 10%, #FA742B 100%)",
        },
        barValue: 70,
        value: "25,970",
       
    },

    {
        title: "Revenue",
        color: {
            background: "linear-gradient(135deg, #48c6ef 10%, #6f86d6 100%)",
        },
        barValue: 80,
        value: "14,970",
        
    },

    {
        title: "Expenses",
        color: {
            background: "linear-gradient(135deg, #252c42 10%, #3a39c4 100%)",
        },
        barValue: 60,
        value: "4,270",
        
    },
]


