function add(){
   let value  =  document.getElementById("first_input").value;

   document.getElementById("drop_list").innerHTML += `<option value="">${value}</option>`
}
function del(){
    let list =  document.getElementById("drop_list");
    list.options[0].remove();
}