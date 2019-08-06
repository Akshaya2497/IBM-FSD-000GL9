interface automobiles{
    name:string
}
interface car extends automobiles{
    company:string
    nameofcar: string
}
interface bike extends automobiles{
    modeofstart : string

}
const detail={
    car: {
        
        engine : "abc",
        speed : "150kmph"

    },
    bike : {
        milage : 200,
        efficiency : 90
        
    }
}
class _automoblie <T extends automobiles>{
    id : number
    details : T
    constructor(id:number,details:T){
        this.id=id,
        this.details = details
    }
    getDetails(){

        return this.details;
    }
}
const _car = new _automoblie<car>(1,{name: 'car',company:"mercedesBenz",nameofcar: "Benz"});
console.log(_car.getDetails());