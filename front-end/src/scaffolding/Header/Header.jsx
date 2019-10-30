import React, { Component } from 'react';
import "./Header.css"
class Header extends Component {
    state = {}
    render() {
        return (
            <header className="app-header bg-preto d-flex p-3 flex-column text-white">
              <h3><i className={this.props.icon + " mr-3"}></i>{this.props.title}</h3>
              <p>{this.props.mensagem}</p>
            </header>
        );
    }
}

export default Header;
