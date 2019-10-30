import React from 'react';
import srcLogo from '../../assets/logo.png'

const Logo = (props) => {
    return ( 
        <section className="app-logo d-flex align-content-center justify-content-center">
            <img alt="logo da fiap de graduação"src={srcLogo} className="w-100"></img>
        </section>
     );
}
 
export default Logo;