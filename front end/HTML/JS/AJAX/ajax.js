function loadPokemon(pokemon){
    document.getElementById("name").innerHTML=pokemon.name;
}

function getPokemon(){
    console.log("in get pokemon")
    let pokemonID=document.getElementById("pkID").value;

    //step 1
    var xhr=new XMLHttpRequest();
    //step 2 onreadystatechange says what happens when you do the thing. this gives the status of the xhr 
    xhr.onreadystatechange = function(){
    console.log("in ORSC");
        if(xhr.readyState==4&&xhr.status==200){
        console.log(xhr.responseText);
        var pokemon = JSON.parse(xhr.responseText); //js object, our giant printout of pokemon stuff. All the information about pokemon we are getting. 
        //We are taking all the info and tuning it inot a js object then passing it into the load pokemon function to print it in the h3 tag
        loadPokemon(pokemon)
         }
    }
     //status is the number value.
    //once we have this ready state and this status, then we want to do the thing.
    //step 3
    xhr.open("GET","https://pokeapi.co/api/v2/pokemon/"+pokemonID, true); //http method, destination, and the "true or false"

    //step 4
    xhr.send(); //we are doing a get request and sending info through the url. if we are doing a post then the info goes between the parenthesis

}

window.onload= function(){
    console.log("in onload");
    document.getElementById("pokesubmit").addEventListener("click",getPokemon,false)
    //(type of event, the function you want to happen, the use capture if nested elements bubble or capture)
}