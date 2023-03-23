// for(let i = 1 ; i<6 ; i++){
//     document.write(`<h${i}>this a test title</${i}>`);
// }

//------------------------------------------------------------------------------

// let number = prompt("enter a number");
// // parseInt(number);
// let des = true;

// while (des == true) {
//     switch (number) {
//         case "1":
//             document.write(`
//         <ol type='A'>
//         <li>item num 1</li>
//         <li>item num 2</li>
//         <li>item num 3</li>
//         </ol>
//         `);
//             des = false;
//             break;
//         case "2":
//             document.write(`
//         <ol>
//         <li>item num 1</li>
//         <li>item num 2</li>
//         <li>item num 3</li>
//         </ol>
//         `);
//             des = false;
//             break;
//         case "3":
//             document.write(`
//         <ul>
//         <li>item num 1</li>
//         <li>item num 2</li>
//         <li>item num 3</li>
//         </ul>
//         `);
//             des = false;
//             break;
//         default:
//           number = prompt("you have entered a wrong number enter a valid number ");
//             break;
//     }
// }
// ------------------------------------------------------------------------

des = true
// while(des){
// var number1 = prompt("enter number 1");
// var number2 = prompt("enter number 2");
// var number3 = prompt("enter number 3");
// parseInt(number1);
// if (Number.isNaN(number1)) {
//     console.log("true") ;
// }
// }


// document.write(`this is the second number: ${number2}<br>`);
// document.write(`this is the third number: ${number3}<br>`);
// document.write(`the max number is${Math.max(number1 , number2 , number3)}<br>`);
// document.write(`the min number is${Math.min(number1 , number2 , number3)}<br>`);

var check1 = true
var check2 = true
var check3 = true
while (des) {
    while (check1) {
        var number1 = prompt("enter number 1");
        if (!isNaN(number1)) {
            check1 = false
        }
    }
    while (check2) {
        var number2 = prompt("enter number 2");
        if (!isNaN(number2)) {
            check2 = false
        }
    }
    while (check3) {
        var number3 = prompt("enter number 3");
        if (!isNaN(number3)) {
            check3 = false
        }
    }

    document.write(`this is the second number: ${number1}<br>`);
    document.write(`this is the second number: ${number2}<br>`);
    document.write(`this is the third number: ${number3}<br>`);
    document.write(`the max number is ${Math.max(number1, number2, number3)}<br>`);
    document.write(`the min number is ${Math.min(number1, number2, number3)}<br>`);
    des = false
}