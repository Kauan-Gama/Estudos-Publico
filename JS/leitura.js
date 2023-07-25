const dados = require("./cliente.json");

console.log(dados)
console.log(typeof dados)

const clientestring = JSON.stringify(dados)

console.log(clientestring)
console.log(typeof clientestring)

console.log(clientestring.nome)

const objcliente = JSON.parse(clientestring)

console.log(objcliente)