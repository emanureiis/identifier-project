const url = "http://localhost:8080/identificador/creditos";

const creditosContainer = document.querySelector("#creditos-container")

async function getAllCreditos() {
    const response = await fetch(url);
    // console.log(response);
    const data = await response.json(); //pega o Json da resposta recebida
    // console.log(data)
    data.map((credito) => {

        const table = document.createElement("table")
        const trow = document.createElement("tr")
        
        const thNome = document.createElement("th")
        const thCodigo = document.createElement("th")
        const thNaoLiquidado = document.createElement("th")
        
        const codigo = document.createElement("td");
        const nomeCliente = document.createElement("td");
        const naoLiquidado = document.createElement("td");
        
        thCodigo.innerText ='Código';
        thNome.innerText ='Nome';
        thNaoLiquidado.innerText ='Valor';
        
        codigo.innerText = credito.codigo;
        nomeCliente.innerText = credito.nomeCliente;
        naoLiquidado.innerText = credito.naoLiquidado;
        
        table.appendChild(thCodigo);
        table.appendChild(thNome);
        table.appendChild(thNaoLiquidado);
        table.appendChild(trow);
        table.appendChild(codigo);
        table.appendChild(nomeCliente);
        table.appendChild(naoLiquidado);

        creditosContainer.appendChild(table);        
    })
}

getAllCreditos();

const indexBtn = document.querySelector("#indexBtn");

indexBtn.addEventListener('click', () =>  {
    window.location.href = "/index.html"
});