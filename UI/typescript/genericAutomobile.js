var detail = {
    car: {
        engine: "abc",
        speed: "150kmph"
    },
    bike: {
        milage: 200,
        efficiency: 90
    }
};
var _automoblie = /** @class */ (function () {
    function _automoblie(id, details) {
        this.id = id,
            this.details = details;
    }
    _automoblie.prototype.getDetails = function () {
        return this.details;
    };
    return _automoblie;
}());
var _car = new _automoblie(1, { name: 'car', company: "mercedesBenz", nameofcar: "Benz" });
console.log(_car.getDetails());
