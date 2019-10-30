import React from 'react';
import Main from "./../Main/Main"

const testeProps = {
    title: 'titulo teste',
    icon: 'fas fa-tools',
    mensagem: 'essa mensagem aqui é de teste heim'
}

const Teste = props => 
    <Main {...testeProps}>
        <h1>Eu sou teste</h1>
    </Main>
    
export default Teste;