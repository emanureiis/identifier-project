const responseBtn = document.querySelector("#responseBtn");
const formulario = document.querySelector("form");
const iempresa = document.querySelector("#names");
const inaoLiquidado = document.querySelector("#value");
const arquivoInput = document.querySelector("#arquivo");

function enviar() {
    var dados = new FormData();
    dados.append("empresa", iempresa.value);
    dados.append("naoLiquidado", inaoLiquidado.value);
    dados.append("arquivo", arquivoInput.files[0]);

    fetch("http://localhost:8080/identificador/dados", {
        method: "POST",
        body: dados
    })
    .then(function (res) { console.log(res) })
    .catch(function (res) { console.log(res) });

    responseBtn.addEventListener('click', () =>  {
        window.location.href = "/response.html"
    });
    
}

function limpar() {
    iempresa.value = "";
    inaoLiquidado.value = "";
    arquivoInput.value = "";
}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    enviar();
});



