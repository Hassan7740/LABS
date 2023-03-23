function scan() {
  // console.log("ji")
  // const form = document.forms["form1"];
  // var ar=[];
  // ar[0] = document.getElementById("userName").value; 
  // let password = document.getElementById("pass").value; 
  // let confirmPassword = document.getElementById("confPass").value; 
  // let creditCard = document.getElementById("ccn").value; 
  // let name = document.getElementById("Name").value; 
  // let birthDate = document.getElementById("date").value; 
  // let color = document.getElementById("color").value; 
  // let file  = document.getElementById("img").value;
  // let browser  = document.getElementById("Browser").value;
  // let number  = document.getElementById("noe").value;
  // let numOfEmp  = document.getElementById("er").value;
  // let email  = document.getElementById("email").value;
  // let phoneNUmber  = document.getElementById("ph").value;
  // let webSite = document.getElementById("url").value;

  // console.log(userName);
  // console.log(password);
  // console.log(confirmPassword);
  // console.log(creditCard);
  // console.log(name);
  // console.log(birthDate);
  // console.log(color);
  // console.log(browser);
  // console.log(number);
  // console.log(numOfEmp);
  // console.log(email);
  // console.log(phoneNUmber);
  // console.log(webSite);
  let myData = document.getElementsByName("test");
  let myL = document.getElementsByTagName("label");

  let mytext = "";


  for (let i = 0; i < myData.length; i++) {
    mytext += `${myL[i].innerHTML} : ${myData[i].value}<br>`;
  }
  let password =  document.getElementById("pass").value;
  let confirmPassword = document.getElementById("confPass").value
  if (password == confirmPassword) {
    window.open('', '', 'width=500px , heigth=500px').document.write(`${mytext}`);
  }
  else{
    alert("password mismatch");
  }
}

