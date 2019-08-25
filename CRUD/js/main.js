  document.getElementById("form").addEventListener("submit", e=>{
         let name = document.getElementById("name").Value;
         let email = document.getElementById("email").Value;
         createUser(name,email);
        e.preventDefault();
  });

  var users= [];

  function createUser(name,email){
      var user={
          name:name,
          email:email 
      }
      users.push(user);
      readUser();
     console.log(users);
      document.getElementById("form").reset();
  }

  function readUser(){
      var userhtml = document.getElementById('user');
      userhtml.innerHTML= '';
      for(var i=0; i<users.length;i++){
          userhtml.innerHTML+= `<div class="black"><p>NAME: ${user[i].name}</p><p>EMAIL:
           {users[i].email}</p><buton class="edit" onClick="updateUser('${i}')"> `
           
      }
       
  }
