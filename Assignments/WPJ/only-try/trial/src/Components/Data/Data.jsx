// Sidebar imports
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
    },
    {
        icon: UilClipboardAlt,
        heading: "orders",
    },
    {
        icon: UilUsersAlt,
        heading: "Customers",
    },
    {
        icon: UilUsersAlt,
        heading: "Chefs",
    },
    {
        icon: UilPackage,
        heading: "Menu",
    },
    {
        icon: UilChart,
        heading: "Analytics",
    },
    // {
    //     icon: UilSignOutAlt,
    //     heading: "Sign-Out",
    // },
]

// in this we are creating a javascript object and each object will represent an individual card
export const CardsData = [
    {
        title: "Sales",
        color: {
            background: "linear-gradient(135deg, #FFE985 10%, #FA742B 100%)",
            boxShadow: "0px 10px 20px 0px rgba(255,255,255)",
        },
        barValue: 70,
        value: "25,970",
        // png: UtilUsdSquare,   // dollar image in card
        series: [
            {
                name: "Sales",
                data: [31, 40, 28, 51, 42, 109, 100],
            },
        ]
    },

    {
        title: "Revenue",
        color: {
            background: "linear-gradient(135deg, #48c6ef 10%, #6f86d6 100%)",
            boxShadow: "0px 10px 20px 0px rgba(255,255,255)",
        },
        barValue: 80,
        value: "14,970",
        // png: UtilMoneyWithdrawal,   // dollar image in card
        series: [
            {
                name: "Sales",
                data: [10, 100, 50, 70, 80, 30, 40],
            },
        ]
    },

    {
        title: "Expenses",
        color: {
            background: "linear-gradient(135deg, #252c42 10%, #3a39c4 100%)",
            boxShadow: "0px 10px 20px 0px rgba(255,255,255)",
        },
        barValue: 60,
        value: "4,270",
        png: UilClipboardAlt,   // dollar image in card
        series: [
            {
                name: "Sales",
                data: [10, 25, 15, 30, 12, 15, 20],
            },
        ]
    },
]


