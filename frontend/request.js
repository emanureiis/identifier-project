const responseBtn = document.querySelector("#responseBtn");

const formulario = document.querySelector("form");
const empresa = document.querySelector("#names");
const naoLiquidado = document.querySelector("#value");
const pdf = document.querySelector("#arquivo");

function enviar() {
    var data = new FormData();

    data.append("empresa", empresa.value);
    data.append("naoLiquidado", naoLiquidado.value);
    data.append("pdf", pdf.files[0]);

    fetch("http://localhost:8080/identificador/request", {
        method: "POST",
        body: data
    })
    .then(function (res) { console.log(res) })
    .catch(function (res) { console.log(res) });

    // responseBtn.addEventListener('click', () =>  {
    //     window.location.href = "/response.html"
    // });
    
}

// function limpar() {
//     empresa.value = "";
//     naoLiquidado.value = "";
//     pdf.value = "";
// }

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    enviar();
    // limpar();
});



