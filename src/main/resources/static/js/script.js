// var n = window.prompt("name?", "Fardin");
// console.log("Hello, " + n + "!");

var button = document.querySelector('input[value="SUBMIT"]');
button.addEventListener('click', function(evt) {
    evt.preventDefault();
    var text = document.getElementById('fname').value;
    document.getElementsByTagName('legend')[0].innerHTML = text;
});
