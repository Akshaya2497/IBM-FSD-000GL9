const trnDetails=()=>{
   let tName=document.getElementById('tname').value;
    let tSkills=document.getElementsByName('skill');
    
    for(var i=0; i<tSkills.length; i++){
        
        
       if(tSkills[i].checked==true){
            
            localStorage.setItem(tSkills[i].value,tName);
        }
    }
}

const selectTime=(val)=>{
    classA._timeslot(val);
}

const lockTrainer=(val)=>{
    
}
const classSec=(sec)=>{
        if(sec=="classA"){
            let _classa = new classA();
        }
        let _classb = new classB();

}
const showTrainer=(val)=>{
    classA._showTrainer(val);
}
const createTable=()=>{
    classA._createtable();
}
const classA=class{
    sub;
    time;
   
    _showTrainer=(val)=>{
        let rows='';
         let  trainers;  
             
        trainers=localStorage.getItem(val);
        console.log(trainers);
        rows=`<td><select onchange=lockTrainer(value)>
            <option  value=${trainers}>${trainers}</option>
             </select></td>`;
         document.getElementById("trnAvail").innerHTML=rows;      
    }
    _timeslot(val){
        this.time=val;
        
        localStorage.setItem(val,"");
        console.log("time");
    }
    _createtable(){
        let rows=`
            <table>
            
    
                    <tr>
                        <th>Timings</th>
                        <th>Subject</th>
                        <th>Trainer</th>
                        
                    </tr>
                    <tr>
                        <td>10-11</td>
                        <td>English</td>
                        
                        
                    </tr>
                    <tr>
                        <td>11-12</td>
                        <td>Maths</td>
                        
                    </tr>
                    
                    <tr>
                            <td>12-1</td>
                            <td>Physics</td>
                            
                    </tr>
                    <tr>
                            <td>1-2</td>
                            <td>Biology</td>
                            
                    </tr>
                    <tr>
                            <td>2-3</td>
                            <td>chemistry</td>
                              
                    </tr>
                    <tr>
                            <td>3-4</td>
                            <td>CS</td>
                           
                    </tr>
                </table>`;
       document.getElementById("tt").innerHTML=rows;
    }
}