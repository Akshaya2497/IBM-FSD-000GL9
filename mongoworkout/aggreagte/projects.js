db.projects.insert([
    {
    _id : 1,
    name : "Google",
    entourage : [
        {
            id : 1,
            name : "Akshaya",
            salary : 1000000
        },
        {
            id : 2,
            name : "Steve Rogers",
            salary : 2000000
        } 
    ],
    renumeration : 10000000,
    
    },
    {
    _id : 2,
    name : "Facebook",
    entourage : [
        {
            id : 1,
            name : "Tony",
            salary : 1900000
        },
        {
            id : 2,
            name : "Ian Somerhalder",
            salary : 1000000
        },  
    ],
    renumeration : 2000000
    }
]);
db.projects.update({
    _id : 1
},
{
    $set : { salary : 15}
}
);
db.projects.update({
    _id : 2
},
{
    $set : { salary : 20}
}
);
