let val ='';
            let pId;
            const play=(id)=>{
                document.getElementById(id).value=val;
                console.log(id);
                let  _index=parseInt(id);
                let neighbour=checkNeighbour(val, _index);
                if(neighbour){
                    alert("You have won the game!!");
                    
                }
                let diagonal=checkDiagonal(val,id);
                if(diagonal){
                    alert("You have won the game!!");
                    
                }
                let straight = checkStraight(val,id);
                if(straight){
                    alert("You have won the game!!");
                    
                }
                else{
                    alert("Game Draw");
                }

            }
            const choose=(id)=>{
                console.log(id);
                    if(id == 'p1'){
                        val='x';  
                    }                  
                    else{
                        val = 'o';
                    }
            }
            const checkNeighbour=(val,_index)=>{
               
                if(_index%2!=0 && _index != 5){ //1,3,7,9
                    let c=0;
                    if(_index == 1 || _index == 7){ //forward
                        for(let i=1; i<3;i++){
                            if(!document.getElementById(_index+i).value != val)
                            break;
                            c++;
                        }
                        if(c==2){
                        return 1;
                       
                        }
                    }
                    if(_index == 3 || _index == 9){ //backward 
                        let c=0;
                        for(let i=1; i<3;i++){
                            if(document.getElementById(_index-i).value != val)
                            break;
                            c++;
                        }
                        if(c==2){
                        return 1;
                        e
                        }
                    }
                    if(_index == 3 || _index == 1){
                        let c=0;
                        for(let i=1; i<10;i+=3){
                            if(document.getElementById(_index+i).value != val)
                            break;
                            c++;
                        }
                    }
                    if(_index == 7 || _index == 9){
                        let c=0;
                        for(let i=_index-3; i>0;i-=3){
                            if(document.getElementById(_index).value != val)
                            break;
                            c++;
                        }
                    }

                    
                }
                else if(_index!=5){
                    if(_index == 2 || _index == 8 ){ //neighbours
                        let c=0;
                        for(let i=1;i<3;i++){                            
                            if(document.getElementById(_index+1).value != val)
                                break;
                            if(document.getElementById(_index-1).value != val)
                                break;    

                                c++;
                        }
                        if(c==2){
                            return 1;
                            
                        }
                    }
                
                    if( _index == 2 ){
                        let c=0;
                        for(let i=3;i<9;i+=3){                            
                            if(document.getElementById(_index+i).value != val)
                                break;                             

                                c++;
                        }
                        if(c==2){
                            return 1;
                            exit(0);
                        }
                    }
                    if( _index == 8 ){
                        let c=0;
                        for(let i=3;i<9;i+=3){                            
                            if(document.getElementById(_index-i).value != val)
                                break;                             

                                c++;
                        }
                        if(c==2){
                            return 1;
                            
                        }
                    }
                    if(_index == 6 || _index == 4){ //neighbours
                        let c=0;
                                                    
                            if(document.getElementById(_index+3).value == val)
                                c++;
                            if(document.getElementById(_index-3).value != val)
                              c++;                                
                        
                        if(c==2){
                            return 1;
                           
                        }
                    }
                    if( _index == 4 ){
                        let c=0;
                        for(let i=1;i<3;i++){                            
                            if(document.getElementById(_index+i).value != val)
                                break;                             

                                c++;
                        }
                        if(c==2){
                            return 1;
                            
                        }
                    }
                    if( _index == 6 ){
                        let c=0;
                        for(let i=1;i<3;i++){                            
                            if(document.getElementById(_index-i).value != val)
                                break;                             

                                c++;
                        }
                        if(c==2){
                            return 1;
                            
                        }
                    }
                }

            }

    const checkDiagonal=(val,_index)=>{
            if(_index == 1){
                        for(let i=4;i<10; i+=4){
                            if(document.getElementById(_index+i).value != val)
                            break;
                            c++;
                        }
                        if(c==2){
                        alert("Winner");
                        
                        }
            }
            if(_index == 9){
                for(let i=4;i<10; i+=4){
                    if(document.getElementById(_index-i).value != val)
                    break;
                    c++;
                }
                if(c==2){
                alert("Winner");
                
                }
            }
            if(_index == 7 || _index == 3){
                for(let i=_index-2;i>=3; i+=2){
                    if(document.getElementById(_index-i).value != val)
                    break;
                    c++;
                }
                if(c==2){
                alert("Winner");
                
                }
    }
    }