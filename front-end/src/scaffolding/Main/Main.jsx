import React, { Component } from 'react'
import Header from '../Header/Header'
class Main extends Component {
    state = {  }
    render() { 
        return ( 
            <React.Fragment>
                <Header title={this.props.title} mensagem={this.props.mensagem} icon={this.props.icon}/>
                <div className="app-main">
                    {this.props.children}
                </div>
            </React.Fragment>
         );
    }
}
 
export default Main;
