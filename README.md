# homecareapp

API para gestão de auxiliares de enfermagem para home care
#

## Endpoints
- Paciente
  - [Cadastrar](#cadastrar-paciente)
  - [Detalhes](#detalhes-paciente)
#

### Cadastrar Paciente
`POST` /homecareapp/api/cadastrar_paciente

*Campos de requisição*
| campo | tipo | obrigatório | descrição |
| - | - | - | - |
| nome | texto | sim | nome do paciente |
| cpf | texto | sim | cpf do paciente |
| cep | texto | sim | cep do endereço do paciente |
| número | inteiro |  sim | número do imóvel |
| complemento | texto | não | complemento do imóvel |
| logradouro | texto | sim | nome do logradouro |
| bairro | texto | sim | bairro do paciente |
 
*Exemplo de requisição*
```
{
  "nome": "Brenda Mariana Fogaça",
  "cpf": "23455450890",
  "cep": "05570160",
  "numero": 518,
  "complemento": "",
  "logradouro": "Rua Virgílio Ribeiro",
  "bairro": "Jardim Amaralina"
}
```

*Exemplo de Resposta*
| código | descrição |
| - | - |
| 200 | Estas requisição foi bem sucedida |
| 400 | O servidor não entendeu a requisição, campos inválidos |
#

### Detalhes Paciente
`GET` /homecareapp/api/paciente/{id}

*Exemplo de Resposta*
```
{
  "nome": "Brenda Mariana Fogaça",
  "cpf": "23455450890",
  "cep": "05570160",
  "numero": 518,
  "complemento": "",
  "logradouro": "Rua Virgílio Ribeiro",
  "bairro": "Jardim Amaralina"
}
```

*Resposta*
| código | descrição |
| - | - |
| 200 | Requisição concluída com sucesso |
| 404 | Não foi encontrado paciente com o ID fornecido |