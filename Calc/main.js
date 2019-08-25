function calc() {
    var a = parseInt(document.querySelector("#value1").Value);
    var b = parseInt(document.querySelector("#value2").Value);
    var op = document.querySelector("#operator").Value;
    var calculate;

    if ( op == "add"){
       var calculate = a + b;
    } else if (op == "min") {
        calculate = a - b;
    } else if (op == "div") {
        calculate = a / b;
    } else if (op == "mul") {
        calculate = a * b;
    } 
    document.querySelector("#result").innerHTML = calculate;

  }