import React, { Component } from 'react'
import Main from './../Main/Main.jsx'

const homeProps = {
    title: 'Home',
    icon: 'fa fa-home',
    mensagem: 'Bem vindo a home'

}

class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {}
    }
    render() {
        return (
            <Main {...homeProps}>
                <h1>Eu sou a home</h1>
            </Main>
        );
    }
}

export default Home;