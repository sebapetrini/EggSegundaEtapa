import React, { Children } from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import Home from './pages/Home/Home.jsx';
import Pokemons from './pages/Pokemons/Pokemons.jsx';
import './main.css';
import App from './App.jsx';
import Game from './pages/Game/Game.jsx';

const route = createBrowserRouter([
  {
    path : "/",
    element : <App />,
    children : [
      {
        path : "/",
        element : <Home />,
      },
      {
        path : "/pokemons",
        element : <Pokemons />,
      },
      {
        path : "/game",
        element : <Game />,
      }
    ]
  }
])

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={route} />
  </React.StrictMode>,
)
