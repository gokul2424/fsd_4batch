function xyz() {
    return "33";
}
let abc = xyz();
var Weekdays;
(function (Weekdays) {
    Weekdays["Monday"] = "MON";
    Weekdays["Tuesday"] = "TUES";
    Weekdays["Wednesday"] = "WED";
})(Weekdays || (Weekdays = {}));
console.log(Weekdays.Tuesday);
//# sourceMappingURL=demo.js.map