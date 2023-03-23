function search(){
    let textAreaString = document.getElementById("textarea").value ;
    let search = document.getElementById("charchter_input").value;
    let index = document.getElementById("index").value;
    parseInt(index);
    let search_resault_first = textAreaString.indexOf(search , index);
    let search_resault_last = textAreaString.lastIndexOf(search , index);
    let resault_last = textAreaString.lastIndexOf(search);
    let resault_first = textAreaString.indexOf(search);

    document.getElementById("first_located_index").innerHTML =  `the first located value from your index is ${search_resault_first}`; 
    document.getElementById("last_located_index").innerHTML =  `the last located value from your index is ${search_resault_last}`; 
    document.getElementById("first_located").innerHTML =  `the first located value is ${resault_first}`; 
    document.getElementById("last_located").innerHTML =  `the last located value  ${resault_last}`; 

}