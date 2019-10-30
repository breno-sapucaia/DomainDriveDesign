import React from 'react'
import { Switch, Route, Redirect } from 'react-router'
import Home from '../scaffolding/Home/Home'
import Teste from '../scaffolding/Teste/Teste'
export default props =>
    <Switch>
        <Route path="/teste" component={Teste}/>
        <Route path="/" component={Home}/>
    </Switch>
