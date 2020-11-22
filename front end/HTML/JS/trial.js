function pow(event){
    element = event.currentTarget;
    element.style.backgroundColor="cornflowerblue"; 
    alert(element.id);
}

//anonymous function
window.onload= function (){
    //               useCapture/Event Propagation- false- Bubbling, target to Root
    //                                             true- capturing, root to target
    this.document.getElementById("R").addEventListener("click",pow,true);
    this.document.getElementById("A").addEventListener("click",pow,true);
    this.document.getElementById("C").addEventListener("click",pow,true);
    this.document.getElementById("I").addEventListener("click",pow,true);
    this.document.getElementById("N").addEventListener("click",pow,true);
    this.document.getElementById("G").addEventListener("click",pow,true);
}