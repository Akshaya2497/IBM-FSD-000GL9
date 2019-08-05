db.projects.aggregate([
    {
        $match : {} 
    }, 
    {      
        $group : {
                _id : 0,
                max : {
                    $sum :'$salary'
                }
        }
    }    
    
]);
db.projects.aggregate([
    {
        $match : {} 
    }, 
    {      
        $group : {
                _id : '$_id',
                total : {
                    $sum :'$salary'
                }
        }
    }    
    
]);
db.projects.aggregate([
    {$unwind : "$entourage"}
]).pretty();
//deleting a field
db.projects.updateMany({},{
    $unset : {salary : 1}
});


//to find total salary inside entourage
	db.projects.aggregate([
            {
                $unwind : "$entourage" 
            }, 
            {      
                $group : {
                        _id : 0,
                        max : {
                            $sum :"$entourage.salary"
                        }
                }
            }    
            
        ]);
		
        db.createUser({
    		user:"dbUser",
    		pwd:"pass@123",
    		roles:[
        		{role: "readWrite",db:"my-db"}
        	]});

		db.createUser({
		    user : "readUser",
		    pwd : "123",
		    roles : [
			{
			    role : "allowReadAccess", db : "admin"
			}
		    ]
		});