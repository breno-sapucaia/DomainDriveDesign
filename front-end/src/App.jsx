import React from 'react';
import { BrowserRouter } from 'react-router-dom'
import './App.css';
import Logo from "./scaffolding/Logo/Logo.jsx"

import Routes from "./Main/Routes"
function App() {
  return (
    <div className="app">
      <BrowserRouter>
        <Logo />
        <Routes />
        <nav className="app-nav">

        </nav>
        <footer className="app-footer">

        </footer>
      </BrowserRouter>
    </div>
  );
}

export default App;
