function splitStrings() {
    let textAreaString = document.getElementById("inputText").value;
    let delemetir = document.getElementById("dele").value;
    let stringArray = textAreaString.split(delemetir);
    let integerNum = 25 ; 
    
       for(let i = 0 ; i < stringArray.length ; i++){
        document.getElementById("resault").innerHTML += `${stringArray[i]}\n` ;
       }

       confirm.log()
    document.getElementById("first_10").innerHTML = `the first 10 char are : ${textAreaString.slice(0,10)}`
}